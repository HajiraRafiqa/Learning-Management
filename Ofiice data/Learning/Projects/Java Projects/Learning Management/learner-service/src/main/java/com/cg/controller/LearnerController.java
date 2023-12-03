package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Learner;
import com.cg.service.LearnerService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/learner")
@CrossOrigin(origins = "http://localhost:3000")
public class LearnerController {
		
	@Autowired
	LearnerService learnerService;
	
	@PostMapping("/addLearner")
	ResponseEntity<Learner> addLearner(@RequestBody @Valid Learner learner) {
		
		String status = learnerService.addLearner(learner);
		
		log.info("Learner added status - " + status);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(learner);
	}
	
	@GetMapping("/listById/{id}")
	Learner getLearnerById(@PathVariable("id") int id) {
		return learnerService.getLearnerById(id);
	}
	
	@GetMapping("/listByGrade/{grade}")
	List<Learner> getLearnerByGrade(@PathVariable String grade) {
		return learnerService.getLearnerByGrade(grade);
	}
	
	@GetMapping("/listAll")
	List<Learner> getAllLearners()
	{
		return learnerService.getAllLearners();
	}
	
	@DeleteMapping("/{id}")
	String deleteLearnerById(@PathVariable int id) {
		return learnerService.deleteLearnerById(id);
	}

}
