package com.gaonnuri.web.study.controller;

import com.gaonnuri.web.awards.dto.AwardsDTO;
import com.gaonnuri.web.study.dto.StudyDto;
import com.gaonnuri.web.study.entity.StudyPages;
import com.gaonnuri.web.study.service.StudyPagesService;
import com.gaonnuri.web.study.service.StudyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/study")
@RequiredArgsConstructor
@Slf4j
public class StudyController {
    private final StudyService studyService;

    @PostMapping("/add")
    public Boolean addStudy(@RequestBody StudyDto.StudyRegisterDTO studyRegisterDTO) {
        Boolean result = studyService.registerStudy(studyRegisterDTO);
        return result;
    }

    @GetMapping("/{studyId}")
    public StudyDto.StudyResponseDTO studyDetail(@PathVariable Long studyId){
        StudyDto.StudyResponseDTO result = studyService.studyDetail(studyId);
        return result;
    }

    @DeleteMapping("/delete/{studyId}")
    public Boolean deleteStudyPages(@PathVariable Long studyId){
        Boolean result = studyService.deleteStudy(studyId);
        return result;
    }
}
