package com.gaonnuri.web.study.service.impl;

import com.gaonnuri.web.awards.entity.Awards;
import com.gaonnuri.web.study.dto.StudyDto;
import com.gaonnuri.web.study.entity.Study;
import com.gaonnuri.web.study.entity.StudyPages;
import com.gaonnuri.web.study.repository.StudyRepository;
import com.gaonnuri.web.study.service.StudyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
@RequiredArgsConstructor
@Slf4j
public class StudyServiceImpl implements StudyService {
    private final StudyRepository studyRepository;

    @Override
    public Boolean registerStudy(StudyDto.StudyRegisterDTO studyRegister){
        Study study = Study.builder()
                .studyTitle(studyRegister.getTitle())
                .studyImage(studyRegister.getImageUrl())
                .studyTime(studyRegister.getTime())
                .build();
        studyRepository.save(study);
        return true;
    }

    @Override
    public Boolean modifyStudy(Long studyId ,StudyDto.StudyModifyDTO studyModify){
        Study study = studyRepository.findByStudyId(studyId);
        study.update(studyModify);
        studyRepository.save(study);
        return true;
    }
    @Override
    public Boolean deleteStudy(Long studyId){
        Study study = studyRepository.findByStudyId(studyId);
        studyRepository.delete(study);
        return true;
    }
    @Override
    public StudyDto.StudyResponseDTO studyDetail(Long studyId){
        Study study = studyRepository.findByStudyId(studyId);
        StudyDto.StudyResponseDTO result = StudyDto.StudyResponseDTO.builder()
                .studyId(studyId)
                .studyTitle(study.getStudyTitle())
                .studyImage(study.getStudyImage())
                .studyTime(study.getStudyTime())
                .build();
        return result;
    }

    @Override
    public List<StudyDto.studyListDTO> studyAll(){
        List<Study> studies = studyRepository.findAll();
        List<StudyDto.studyListDTO>studyList = new ArrayList<>();
        for(Study study : studies){
            StudyDto.studyListDTO studyListDTO = StudyDto.studyListDTO.builder()
                    .studyId(study.getStudyId())
                    .studyName(study.getStudyTitle())
                    .studyImage(study.getStudyImage())
                    .studyTime(study.getStudyTime())
                    .build();
            studyList.add(studyListDTO);
        }
        return studyList;
    }
}
