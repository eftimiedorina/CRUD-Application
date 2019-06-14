package com.project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurdBackendApplication {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CurdBackendApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		userRepository.save(new User(5,"Diana","parolahaioasa"));
	}

}
