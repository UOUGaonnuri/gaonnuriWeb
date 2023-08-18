package com.gaonnuri.web.awards.service;

import com.gaonnuri.web.awards.dto.AwardsDTO;

public interface AwardsService {
    Boolean registerAwards(AwardsDTO.AwardsRegisterDTO awardsRegister);
}
