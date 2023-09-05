package com.gaonnuri.web.study.service;

import com.gaonnuri.web.study.dto.StudyDto;

public interface StudyPagesService {
    Boolean registerStudyPages(Long studyId ,StudyDto.StudyPagesRegisterDTO studyPagesRegister);
    Boolean deleteStudyPages(Long studyId);
    StudyDto.StudyPagesResponseDTO studyDetail(Long studyPagesId);
}
