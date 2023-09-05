package com.gaonnuri.web.study.service;

import com.gaonnuri.web.awards.dto.AwardsDTO;
import com.gaonnuri.web.study.dto.StudyDto;

public interface StudyService {
    Boolean registerStudy(StudyDto.StudyRegisterDTO studyRegister);
    Boolean deleteStudy(Long studyId);
    StudyDto.StudyResponseDTO studyDetail(Long studyId);
}
