package com.gaonnuri.web.study.service.impl;

import com.gaonnuri.web.study.repository.StudyRepository;
import com.gaonnuri.web.study.service.StudyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
@Slf4j
public class StudyServiceImpl implements StudyService {
    private final StudyRepository studyRepository;


}
