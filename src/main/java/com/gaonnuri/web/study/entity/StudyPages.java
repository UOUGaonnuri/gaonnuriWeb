package com.gaonnuri.web.study.entity;

import com.gaonnuri.web.awards.entity.BaseEntity;
import com.gaonnuri.web.study.dto.StudyDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="studyPages")
@EntityListeners(AuditingEntityListener.class)
public class StudyPages extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studyPageId;

    @Column(nullable = false)
    private String studyPageName;

    @Column(nullable = false)
    private String studyPageContent;

    @ManyToOne(fetch = FetchType.LAZY)
    private Study study;

    public void update(StudyDto.StudyPagesModifyDTO studyPagesModifyDTO){
        this.studyPageName = studyPagesModifyDTO.getStudyPageName();
        this.studyPageContent = studyPagesModifyDTO.getStudyPageContent();
    }
}
