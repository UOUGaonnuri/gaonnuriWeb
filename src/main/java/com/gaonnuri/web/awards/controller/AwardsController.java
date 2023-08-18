package com.gaonnuri.web.awards.controller;

import com.gaonnuri.web.awards.repository.AwardsRepository;
import com.gaonnuri.web.awards.service.AwardsService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class AwardsController {
    private final AwardsService awardsService;

    @PostMapping("/add")
    public String addAward() {

        log.info("success addAward");
        return "success addAward";
    }

    @GetMapping("/get")
    public String getAward() {
        log.info("success getAward");
        return "success getAward";
    }

}
