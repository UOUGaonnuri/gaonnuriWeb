package com.gaonnuri.web.awards.service.impl;

import com.gaonnuri.web.awards.dto.AwardsDTO;
import com.gaonnuri.web.awards.entity.Awards;
import com.gaonnuri.web.awards.repository.AwardsRepository;
import com.gaonnuri.web.awards.service.AwardsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
@Slf4j
public class AwardsServiceImpl implements AwardsService {
    private final AwardsRepository awardsRepository;

    @Override
    public Boolean registerAwards(AwardsDTO.AwardsRegisterDTO awardsRegister){
        Awards awards = Awards.builder()
                .contents(awardsRegister.getContents())
                .build();
        awardsRepository.save(awards);
        return true;
    }

    @Override
    public AwardsDTO.AwardsGetResponseDTO getAwards(){
        Awards awards = awardsRepository.findFirstByOrderByIdDesc();
        AwardsDTO.AwardsGetResponseDTO result = AwardsDTO.AwardsGetResponseDTO.builder()
                .contents(awards.getContents())
                .build();
        return result;
    }
}
