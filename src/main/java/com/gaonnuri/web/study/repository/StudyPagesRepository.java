package com.gaonnuri.web.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyPagesRepository extends JpaRepository<StudyPagesRepository, Long> {

}
