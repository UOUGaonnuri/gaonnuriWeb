package com.gaonnuri.web.study.controller;

import com.gaonnuri.web.study.dto.StudyDto;
import com.gaonnuri.web.study.service.StudyPagesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/studyPage")
@RequiredArgsConstructor
@Slf4j
public class StudyPagesController {
    private final StudyPagesService studyPagesService;
    @PostMapping("/{boardId}/add")
    public Boolean addStudyPages(@PathVariable(value = "boardId") Long boardId, @RequestBody StudyDto.StudyPagesRegisterDTO studyPagesRegisterDTO) {
        Boolean result = studyPagesService.registerStudyPages(boardId,studyPagesRegisterDTO);
        return result;
    }

    @GetMapping("/{studyPagesId}")
    public StudyDto.StudyPagesResponseDTO studyPagesDetail(@PathVariable Long studyPagesId){
        StudyDto.StudyPagesResponseDTO result = studyPagesService.studyDetail(studyPagesId);
        return result;
    }

    @DeleteMapping("/delete/{studyPagesId}")
    public Boolean deleteStudyPages(@PathVariable Long studyPagesId){
        Boolean result = studyPagesService.deleteStudyPages(studyPagesId);
        return result;
    }
}
