package com.gaonnuri.web.awards.repository;

import com.gaonnuri.web.awards.entity.Awards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AwardsRepository extends JpaRepository<Awards, Long> {

}
