package com.example.demo.Service;
import com.example.demo.repository.PersInfoRepository;
import jakarta.transaction.Transactional;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.Entities.Personalnfo;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Transactional
public class PersInfoService {
	
	@Autowired
	private PersInfoRepository repository;
	
	public List<Personalnfo> getAll(){
		return this.repository.findAll();
	}
	
	public Personalnfo save(Personalnfo person) {
		return this.repository.save(person);
	}
	
	public void update(Personalnfo person) {  
		this.repository.save(person); 
	} 

}
