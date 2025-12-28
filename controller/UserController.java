package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.UserService;
import java.util.List;
import com.example.demo.Entities.User;

@RestController
@RequestMapping("/api/users")
public class UserController{
	
	@Autowired
	private UserService userService;  

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("")
	public List <User> getAllUser() {
        return userService.getAllUser();
    }
	
	
	@PostMapping("/add")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);  
	}
	
}
