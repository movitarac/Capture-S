package com.racic.capture.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.racic.capture.entities.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {
	List<Photo> findByMuseumIdmuseum(Integer id);

	// User findByUserIduser(Integer id);

}
