package com.gaonnuri.web.study.entity;

import com.gaonnuri.web.awards.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudyPages extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studyPageId;

    @Column(nullable = false)
    private String studyPageName;

    @Column(nullable = false)
    private String studyPageContent;

    @ManyToOne
    @JoinColumn(name = "study")
    private Study study;
}
