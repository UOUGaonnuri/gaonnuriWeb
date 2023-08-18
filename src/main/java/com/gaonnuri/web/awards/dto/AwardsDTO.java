package com.gaonnuri.web.awards.dto;

import lombok.*;

import java.time.LocalDate;

public class AwardsDTO {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AwardsRegisterDTO {
        private String contents;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AwardsRegisterDTO2 {
        private String contents;
    }
}
