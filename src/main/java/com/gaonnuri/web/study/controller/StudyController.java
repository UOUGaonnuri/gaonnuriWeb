package com.gaonnuri.web.study.controller;

import com.gaonnuri.web.study.dto.StudyDto;
import com.gaonnuri.web.study.service.StudyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @PutMapping("/modify/{studyId}")
    public Boolean modifyStudy(@PathVariable(value = "studyId") Long studyId, @RequestBody StudyDto.StudyModifyDTO studyModifyDTO) {
        Boolean result = studyService.modifyStudy(studyId, studyModifyDTO);
        return result;
    }
    @GetMapping("/{studyId}")
    public StudyDto.StudyResponseDTO studyDetail(@PathVariable Long studyId){
        StudyDto.StudyResponseDTO result = studyService.studyDetail(studyId);
        return result;
    }

    @DeleteMapping("/delete/{studyId}")
    public Boolean deleteStudy(@PathVariable Long studyId){
        Boolean result = studyService.deleteStudy(studyId);
        return result;
    }

    @GetMapping("/")
    public List<StudyDto.studyListDTO> studyList(){
        List<StudyDto.studyListDTO> result = studyService.studyAll();
        return result;
    }
}
