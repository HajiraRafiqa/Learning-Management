package com.cg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="learner")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Learner {
	@Id
	private int emp_id;
	private String name;
	private String grade;
	private String email;
	
}