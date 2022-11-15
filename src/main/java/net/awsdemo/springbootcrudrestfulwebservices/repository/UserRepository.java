package net.awsdemo.springbootcrudrestfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.awsdemo.springbootcrudrestfulwebservices.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
