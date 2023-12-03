package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Learner;

@Repository
public interface LearnerRepository extends JpaRepository<Learner, Integer> {

	List<Learner> findByGrade(String grade);
}