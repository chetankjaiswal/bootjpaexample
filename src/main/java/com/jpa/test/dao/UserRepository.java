package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepository extends JpaRepository<User , Integer> 
{
	//public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name,String city);
	
	
	//This is HQL or JPQL for getting all users from the DB
	/*
	@Query("select users from User users")
	public List<User> getAllUser();
	*/
	
	//This is HQL for getting user by name
	@Query("select u From User u WHERE u.name =:name")
	public List<User> getUserByName(@Param("name") String name);
	
	
	//JPQL HQL
	@Query("select u from User u where u.name=:n and u.city=:c")
	public List<User> getUserByNameandCity(@Param("n") String name,@Param("c") String city);
	
	//native query
	@Query(value="select *from User",nativeQuery=true)
	public List<User> getUsers();
}
