package com.racic.capture.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.racic.capture.entities.Museum;

public interface MuseumRepository extends JpaRepository<Museum, Integer> {

	// List<Museum> findByName();
	List<Museum> findMuseumByNameIgnoreCaseContaining(String name);
}