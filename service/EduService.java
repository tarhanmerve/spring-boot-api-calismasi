package com.example.demo.Service;
import com.example.demo.repository.EduRepository;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Entities.Education;

@Service
@Transactional
public class EduService {
	
	@Autowired
	private EduRepository eduRepository;

	public List<Education> getAll(){
		return this.eduRepository.findAll();
	}
	
	public Education save(Education edu) {
		return this.eduRepository.save(edu);
	}
	
}
