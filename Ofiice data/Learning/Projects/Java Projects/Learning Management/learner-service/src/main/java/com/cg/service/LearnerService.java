package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Learner;
import com.cg.repository.LearnerRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class LearnerService {
		
	@Autowired
	LearnerRepository learnerRepository;
	
	public String addLearner(Learner l) {
		log.info("Adding employees");
		
		learnerRepository.save(l);
		
		return "Success!!";
	}
	
	public Learner getLearnerById(int emp_id) {
		
		return learnerRepository.findById(emp_id).get();
	}
	
	public List<Learner> getLearnerByGrade(String grade) {
		return learnerRepository.findByGrade(grade);
	}
	
	public List<Learner> getAllLearners(){
		return learnerRepository.findAll();
	}
	
	public String deleteLearnerById(int id) {
		learnerRepository.deleteById(id);
		
		return "Learner Deleted!!";
	}

}
