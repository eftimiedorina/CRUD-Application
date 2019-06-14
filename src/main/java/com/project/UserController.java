package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path="/api")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class UserController {
	
	@Autowired
	private UserRepository userRepository; //return all data from database when a request comes
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userRepository.findAll();
		
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable Integer id){
		return userRepository.findById(id);
		
	}
	
	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Integer id){
		userRepository.deleteById(id);
		return true;
		
	}
	
	@PostMapping("/user")
	public User createUser(User user){
		return userRepository.save(user);
		
	}
	
	@PutMapping("/user")
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	

}
