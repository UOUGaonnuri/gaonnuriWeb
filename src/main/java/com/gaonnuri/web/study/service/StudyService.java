package com.gaonnuri.web.study.service;

import com.gaonnuri.web.awards.dto.AwardsDTO;
import com.gaonnuri.web.study.dto.StudyDto;

import java.util.List;

public interface StudyService {
    Boolean registerStudy(StudyDto.StudyRegisterDTO studyRegister);
    Boolean deleteStudy(Long studyId);
    Boolean modifyStudy(Long studyId ,StudyDto.StudyModifyDTO studyModify);
    StudyDto.StudyResponseDTO studyDetail(Long studyId);
    List<StudyDto.studyListDTO> studyAll();
}
