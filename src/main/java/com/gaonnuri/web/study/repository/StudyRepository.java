package com.gaonnuri.web.study.repository;


import com.gaonnuri.web.study.entity.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyRepository extends JpaRepository<Study, Long> {
    Study findByStudyId(Long studyId);
}
