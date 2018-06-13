package com.racic.capture.services;

import java.util.List;

import com.racic.capture.entities.Photo;

public interface IPhotoService {

	// List<Photo> getListPhoto();

	// void setListPhoto(List<Photo> listPhoto);

	// IUserService getUserService();

	// void setUserService(IUserService userService);

	Photo getPhotoById(int id);

	String addPhoto(Photo photo);

	String deletePhoto(int id);

	List<Photo> getAll();

	String editPhoto(Photo photo);
}