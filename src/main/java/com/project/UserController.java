package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@CrossOrigin(origins = "*")
	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Integer id){
		userRepository.deleteById(id);
		return true;
		
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/user")
	public User createUser(@RequestBody User user){
		User _user = userRepository.save(new User(user.getId(),user.getUserName(),user.getUserPassword()));
		return _user;
		
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping("/user")
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	

}
