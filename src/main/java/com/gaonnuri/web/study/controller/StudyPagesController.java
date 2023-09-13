package com.gaonnuri.web.study.controller;

import com.gaonnuri.web.study.dto.StudyDto;
import com.gaonnuri.web.study.service.StudyPagesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/studyPage")
@RequiredArgsConstructor
@Slf4j
public class StudyPagesController {
    private final StudyPagesService studyPagesService;
    @PostMapping("/add/{studyId}")
    public Boolean addStudyPages(@PathVariable(value = "studyId") Long studyId, @RequestBody StudyDto.StudyPagesRegisterDTO studyPagesRegisterDTO) {
        Boolean result = studyPagesService.registerStudyPages(studyId,studyPagesRegisterDTO);
        return result;
    }

    @PostMapping("/modify/{studyPagesId}")
    public Boolean modifyStudyPages(@PathVariable(value = "studyPagesId") Long studyPagesId, @RequestBody StudyDto.StudyPagesModifyDTO studyPagesModifyDTO) {
        Boolean result = studyPagesService.modifyStudyPages(studyPagesId,studyPagesModifyDTO);
        return result;
    }

    @GetMapping("/detail/{studyPagesId}")
    public StudyDto.StudyPagesResponseDTO studyPagesDetail(@PathVariable Long studyPagesId){
        StudyDto.StudyPagesResponseDTO result = studyPagesService.studyDetail(studyPagesId);
        return result;
    }

    @DeleteMapping("/delete/{studyPagesId}")
    public Boolean deleteStudyPages(@PathVariable Long studyPagesId){
        Boolean result = studyPagesService.deleteStudyPages(studyPagesId);
        return result;
    }

    @GetMapping("/{studyId}")
    public List<StudyDto.studyPagesListDTO> studyPagesList(@PathVariable Long studyId){
        List<StudyDto.studyPagesListDTO> result = studyPagesService.studyPagesAll(studyId);
        return result;
    }
}
