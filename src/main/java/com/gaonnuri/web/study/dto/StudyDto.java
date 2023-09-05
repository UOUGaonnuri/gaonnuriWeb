package com.gaonnuri.web.study.dto;

import com.gaonnuri.web.study.entity.Study;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class StudyDto {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StudyRegisterDTO {
        private String title;
        private String imageUrl;
        private String time;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StudyPagesRegisterDTO {
        private String title;
        private String contents;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StudyResponseDTO {
        private String studyTitle;
        private String studyImage;
        private String studyTime;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StudyPagesResponseDTO {
        private String studyPageName;
        private String studyPageContent;
        private Long studyId;
        private String studyTitle;
    }
}
