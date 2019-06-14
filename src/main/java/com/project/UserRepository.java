package com.project;


import org.springframework.data.jpa.repository.JpaRepository;


//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository


// extends JpaRepository
public interface UserRepository extends JpaRepository<User,Integer> {

	

}
