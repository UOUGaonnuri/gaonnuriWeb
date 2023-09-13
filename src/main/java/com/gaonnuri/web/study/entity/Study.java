package com.gaonnuri.web.study.entity;

import com.gaonnuri.web.awards.entity.BaseEntity;
import com.gaonnuri.web.study.dto.StudyDto;
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
public class Study extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studyId;

    @Column(nullable = false)
    private String studyTitle;

    @Column
    private String studyImage;

    @Column(nullable = false)
    private String studyTime;

    public void update(StudyDto.StudyModifyDTO studyModifyDTO){
        this.studyTitle = studyModifyDTO.getTitle();
        this.studyImage = studyModifyDTO.getImageUrl();
        this.studyTime = studyModifyDTO.getTime();
    }
}
