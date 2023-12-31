package com.gaonnuri.web.study.repository;

import com.gaonnuri.web.study.entity.Study;
import com.gaonnuri.web.study.entity.StudyPages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyPagesRepository extends JpaRepository<StudyPages, Long> {
    StudyPages findByStudyPageId(Long StudyPageId);
    List<StudyPages> findAllByStudy(Study study);

}
