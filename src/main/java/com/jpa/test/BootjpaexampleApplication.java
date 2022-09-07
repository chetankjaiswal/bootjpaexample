package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository=  context.getBean(UserRepository.class);
		
		/*
		 //saving single object of user
		 ------------
		//creating user
		User user = new User();
		user.setName("Chetan Jaiswal");
		user.setCity("Khandwa");
		user.setStatus("Active");
	
		User user1saved=userRepository.save(user);
		System.out.println(user1saved);
		*/
		
		
		//creating object of user
		/*
		User user1= new User();
		user1.setName("vikas");
		user1.setCity("Indore");
		user1.setStatus("Inactive");
		
		 User saved1 = userRepository.save(user1);
		 System.out.println("saved1 "+saved1);
		 
		User user2= new User();
		user2.setName("ankit");
		user2.setCity("Bhopal");
		user2.setStatus("active");
		
		*/
		
		//save list of user or multiple object save at a time
		/*
		List<User> users= List.of(user1,user2);

		Iterable<User> result= userRepository.saveAll(users);
		
		result.forEach(user->{
			System.out.println(user);
		});
		
		System.out.println("done");
		*/
		
		//updating a user object
		/*
		Optional<User> optional = userRepository.findById(3);
		User user = optional.get();
		System.out.println(user);
		user.setName("chetan kumar");
		User save = userRepository.save(user);
		System.out.println("saved user "+save);
	    */	
		
		//find all users
		/*
		List<User> list = userRepository.findAll();
		list.forEach(users->{
			System.out.println(users);
		});
		*/
		
		/*
		 //Delete single object or user 
		  
		userRepository.deleteById(4);
		System.out.println("deleted");	
		
		*/
		
		//Delete multiple object or users
		/*
		List<User> list1 = userRepository.findAll();
		list1.forEach(users->{
			System.out.println(users);
		});
		
		userRepository.deleteAll(list1);
		System.out.println("deleted all uesr");
		*/
		
		
		/*
		 //Find Object by Name
		  
		List<User> byName = userRepository.findByName("Vikas");
		System.out.println("finded users");
		byName.forEach(userbyname->{
			System.out.println(userbyname);
		});*/
		
		
		//Find Objects by name and city
		/*List<User> userss = userRepository.findByNameAndCity("Chetan Jaiswal", "Khandwa");
		for(User u:userss) {
			System.out.println(u);
		}*/
		
		//HQL for selecting all users
		
		/*List<User> allUser = userRepository.getAllUser();
		allUser.forEach(user->System.out.println(user));
		System.out.println("Above list get by  HQL");
		*/
		
		//HQL or jpql for getting user by name
		/*
		List<User> userByName = userRepository.getUserByName("Vikas");
		userByName.forEach(u->System.out.println(userByName));
		*/
		
		//JPQL or HQL
		/*
		List<User> userByNameandCity = userRepository.getUserByNameandCity("Chetan Jaiswal","Khandwa");
		userByNameandCity.forEach(users->System.out.println(users));
		*/
	
		//using native query
		List<User> users = userRepository.getUsers();
		users.forEach(user->System.out.println(user));
   }

}
