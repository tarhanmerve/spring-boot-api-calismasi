package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.EduService;
import java.util.List;
import com.example.demo.Entities.Education;

@RestController
@RequestMapping("/api/education")
public class EduController {
	
	private EduService eduService;

	@Autowired
	public EduController(EduService eduService) {
		super();
		this.eduService = eduService;
	}
	
	@GetMapping("")
	public List<Education> getAll(){
		return eduService.getAll();
	}
	
	@PostMapping("/add")
	public Education save(@RequestBody Education edu) {
		return eduService.save(edu);
	}

}
