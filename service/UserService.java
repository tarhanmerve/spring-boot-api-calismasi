package com.example.demo.Service;
import com.example.demo.repository.*;
import com.example.demo.Entities.User;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUser() {
		return this.userRepository.findAll();
	}

	public User createUser(User user) {
		return this.userRepository.save(user);
	}
}
