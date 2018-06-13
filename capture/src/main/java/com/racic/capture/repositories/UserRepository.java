package com.racic.capture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.racic.capture.entities.User;

//jpa repository pour connecter sql avec spring..no need to type sql request- no more dao
public interface UserRepository extends JpaRepository<User, Integer> {

	User findOneByUsername(String username);
}
