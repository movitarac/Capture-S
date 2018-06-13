package com.racic.capture.services;

import java.util.List;

import com.racic.capture.entities.Museum;

public interface IMuseumService {

	// List<Museum> getListMuseum();

	// void setListMuseum(List<Museum> listMuseum);

	// List<Photo> getListPhoto();

	// void setListPhoto(List<Photo> listPhoto);

	// List<User> getListUser();

	// void setListUser(List<User> listUser);

	Museum getMuseumById(int id);

	void addMuseum(Museum museum);

	String deleteMuseum(int id);

	List<Museum> getAll();

	void editMuseum(Museum museum);

}