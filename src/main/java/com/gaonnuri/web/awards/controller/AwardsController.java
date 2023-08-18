package com.gaonnuri.web.awards.controller;

import com.gaonnuri.web.awards.repository.AwardsRepository;
import com.gaonnuri.web.awards.service.AwardsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class AwardsController {
    private final AwardsService awardsService;

}
