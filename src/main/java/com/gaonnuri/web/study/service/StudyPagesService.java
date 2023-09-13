package com.gaonnuri.web.study.service;

import com.gaonnuri.web.study.dto.StudyDto;

import java.util.List;

public interface StudyPagesService {
    Boolean registerStudyPages(Long studyId ,StudyDto.StudyPagesRegisterDTO studyPagesRegister);
    Boolean modifyStudyPages(Long studyId ,StudyDto.StudyPagesModifyDTO studyPagesModify);
    Boolean deleteStudyPages(Long studyId);
    StudyDto.StudyPagesResponseDTO studyDetail(Long studyPagesId);
    List<StudyDto.studyPagesListDTO> studyPagesAll(Long studyId);
}
