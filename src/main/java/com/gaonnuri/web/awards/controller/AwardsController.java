package com.gaonnuri.web.awards.controller;

import com.gaonnuri.web.awards.dto.AwardsDTO;
import com.gaonnuri.web.awards.repository.AwardsRepository;
import com.gaonnuri.web.awards.service.AwardsService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class AwardsController {
    private final AwardsService awardsService;

    @PostMapping("/add")
    public Boolean addAward(@RequestBody AwardsDTO.AwardsRegisterDTO awardsRegisterDTO) {
        Boolean result = awardsService.registerAwards(awardsRegisterDTO);
        return result;
    }

    @GetMapping("/get")
    public AwardsDTO.AwardsGetResponseDTO getAward() {
        AwardsDTO.AwardsGetResponseDTO result = awardsService.getAwards();
        return result;
    }

}
