package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entities.Experience;
import com.example.demo.Service.ExpService;

@RestController
@RequestMapping("/api/experience")
public class ExpController {
	
	private ExpService expService;
	
	@Autowired
	public ExpController(ExpService expService) {
		super();
		this.expService = expService;
	}

	@GetMapping("")
	public List <Experience> getAll() {
		return expService.getAll();
    }
	
	@PostMapping("/add")
	public Experience save(@RequestBody Experience exp) {
		 return expService.save(exp);  
	 }
}
