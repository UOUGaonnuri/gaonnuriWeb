package com.gaonnuri.web.study.service.impl;

import com.gaonnuri.web.study.dto.StudyDto;
import com.gaonnuri.web.study.entity.Study;
import com.gaonnuri.web.study.entity.StudyPages;
import com.gaonnuri.web.study.repository.StudyPagesRepository;
import com.gaonnuri.web.study.repository.StudyRepository;
import com.gaonnuri.web.study.service.StudyPagesService;
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
public class StudyPagesServiceImpl implements StudyPagesService {
    private final StudyPagesRepository studyPagesRepository;
    private final StudyRepository studyRepository;

    @Override
    public Boolean registerStudyPages(Long studyId, StudyDto.StudyPagesRegisterDTO studyPagesRegister){
        Study study = studyRepository.findByStudyId(studyId);
        StudyPages studyPages = StudyPages.builder()
                .studyPageName(studyPagesRegister.getStudyPageName())
                .studyPageContent(studyPagesRegister.getStudyPageContent())
                .study(study)
                .build();
        studyPagesRepository.save(studyPages);
        return true;
    }

    @Override
    public Boolean modifyStudyPages(Long studyPagesId ,StudyDto.StudyPagesModifyDTO studyPagesModify){
        StudyPages studyPages = studyPagesRepository.findByStudyPageId(studyPagesId);
        studyPages.update(studyPagesModify);
        studyPagesRepository.save(studyPages);
        return true;
    }
    @Override
    public Boolean deleteStudyPages(Long studyPageId){
        StudyPages studyPages = studyPagesRepository.findByStudyPageId(studyPageId);
        studyPagesRepository.delete(studyPages);
        return true;
    }

    @Override
    public StudyDto.StudyPagesResponseDTO studyDetail(Long studyPagesId){
        StudyPages studyPages = studyPagesRepository.findByStudyPageId(studyPagesId);
        Long studyId = studyPages.getStudy().getStudyId();
        String studyTitle = studyPages.getStudy().getStudyTitle();
        StudyDto.StudyPagesResponseDTO result = StudyDto.StudyPagesResponseDTO.builder()
                .studyPageId(studyPagesId)
                .studyTitle(studyPages.getStudyPageName())
                .studyPageContent(studyPages.getStudyPageContent())
                .studyId(studyId)
                .studyTitle(studyTitle)
                .build();
        return result;
    }

    @Override
    public List<StudyDto.studyPagesListDTO> studyPagesAll(Long studyId){
        Study study = studyRepository.findByStudyId(studyId);
        List<StudyPages> studyPages = studyPagesRepository.findAllByStudy(study);
        List<StudyDto.studyPagesListDTO>studyPagesList = new ArrayList<>();
        for(StudyPages studyPage : studyPages){
            StudyDto.studyPagesListDTO studyPagesListDTO = StudyDto.studyPagesListDTO.builder()
                    .studyPagesId(studyPage.getStudyPageId())
                    .studyPageName(studyPage.getStudyPageName())
                    .studyPageContent(studyPage.getStudyPageContent())
                    .build();
            studyPagesList.add(studyPagesListDTO);
        }
        return studyPagesList;
    }
}
