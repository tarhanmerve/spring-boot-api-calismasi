package com.example.demo.Controller;
import com.example.demo.Service.PersInfoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entities.Personalnfo;

@RestController
@RequestMapping("/api/person")
public class PersInfoController {
	
	private PersInfoService service;

	@Autowired
	public PersInfoController(PersInfoService persService) {
		super();
		this.service = persService;
	}
	
	@GetMapping("")
	public List<Personalnfo> getAll(){
		return service.getAll();
	}
	
	@PostMapping("/add")
	public Personalnfo save(@RequestBody Personalnfo person) {
		return service.save(person);
	}
	
}
