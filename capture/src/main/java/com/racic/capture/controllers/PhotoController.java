package com.racic.capture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.racic.capture.entities.Photo;
import com.racic.capture.services.IPhotoService;

@CrossOrigin
@RestController
public class PhotoController implements IPhotoController {

	@Autowired
	IPhotoService photoService;

	PhotoController() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.racic.capture.controllers.IPhotoController#getAll()
	 */
	@Override
	@RequestMapping("/photos")
	public List<Photo> getAll() {
		return this.photoService.getAll();
	}

	@RequestMapping(value = "/photo/{id}", method = RequestMethod.GET)
	public Photo getPhotoById(@PathVariable int id) {
		Photo photo = this.photoService.getPhotoById(id);
		return photo;

	}

	@RequestMapping(value = "/photo/add", method = RequestMethod.POST)
	public String addPhoto(@RequestBody Photo photo) {
		System.out.println(photo.getNameP());
		this.photoService.addPhoto(photo);
		return "ok";
	}

	@RequestMapping(value = "/photo/{id}", method = RequestMethod.DELETE)
	public String deletePhoto(@PathVariable int id) {
		this.photoService.deletePhoto(id);
		return "photo deleted";
	}
}
