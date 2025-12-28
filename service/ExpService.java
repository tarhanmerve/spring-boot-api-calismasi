package com.example.demo.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.Entities.Experience;
import com.example.demo.repository.*;

@Service
@Transactional
public class ExpService{
	
	@Autowired
	private ExpRepository expRepository;

	public List<Experience> getAll() {
		return this.expRepository.findAll();
	}
	
	public Experience save(Experience exp) {
		return this.expRepository.save(exp);
	}

}
