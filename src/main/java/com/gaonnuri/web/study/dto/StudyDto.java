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
        private Long state;
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
        private Long studyId;
        private String studyTitle;
        private String studyImage;
        private String studyTime;
        private Long studyState;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StudyPagesResponseDTO {
        private Long studyPageId;
        private String studyPageName;
        private String studyPageContent;
        private Long studyId;
        private String studyTitle;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class studyListDTO {
        private Long studyId;
        private String studyName;
        private String studyTime;
        private String studyImage;
        private Long studyState;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class studyPagesListDTO {
        private Long studyPagesId;
        private String studyPageName;
        private String studyPageContent;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StudyModifyDTO {
        private String title;
        private String imageUrl;
        private String time;
        private Long state;
    }
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StudyPagesModifyDTO {
        private String title;
        private String contents;
    }
}
