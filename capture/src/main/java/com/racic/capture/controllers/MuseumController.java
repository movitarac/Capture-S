package com.racic.capture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.racic.capture.entities.Museum;
import com.racic.capture.entities.Photo;
import com.racic.capture.repositories.MuseumRepository;
import com.racic.capture.repositories.PhotoRepository;
import com.racic.capture.services.IMuseumService;

@CrossOrigin
@RestController
public class MuseumController implements IMuseumController {
	@Autowired
	IMuseumService museumService;

	@Autowired
	PhotoRepository pr;

	@Autowired
	MuseumRepository mr;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.racic.capture.controllers.IMuseumController#getMuseumService()
	 */
	@Override
	public IMuseumService getMuseumService() {
		return museumService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.racic.capture.controllers.IMuseumController#setMuseumService(com.racic.
	 * capture.services.IMuseumService)
	 */
	@Override
	public void setMuseumService(IMuseumService museumService) {
		this.museumService = museumService;
	}

	MuseumController() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.racic.capture.controllers.IMuseumController#getAll()
	 */
	@Override
	@RequestMapping("/museums")
	public List<Museum> getAll() {
		return this.museumService.getAll();
	}

	@RequestMapping(value = "/museum/{id}", method = RequestMethod.GET)
	public List<Photo> getMuseumById(@PathVariable int id) {
		// Museum museum = this.museumService.getMuseumById(id);
		// return museum;
		return this.pr.findByMuseumIdmuseum(id);

	}

	public PhotoRepository getPr() {
		return pr;
	}

	public void setPr(PhotoRepository pr) {
		this.pr = pr;
	}

	public MuseumRepository getMr() {
		return mr;
	}

	public void setMr(MuseumRepository mr) {
		this.mr = mr;
	}

	@RequestMapping(value = "/museum/", method = RequestMethod.GET)
	public List<Museum> getByName(@RequestParam(name = "name") String name) {
		return this.mr.findMuseumByNameIgnoreCaseContaining(name);
	}

	@RequestMapping(value = "/museum/s/{id}", method = RequestMethod.GET)
	public Museum getById(@PathVariable int id) {
		// Museum museum = this.museumService.getMuseumById(id);
		// return museum;
		return this.museumService.getMuseumById(id);

	}

	@RequestMapping(value = "/museum/add", method = RequestMethod.POST)
	public String addMuseum(@RequestBody Museum museum) {
		System.out.println(museum.getName());
		this.museumService.addMuseum(museum);
		return "ok";
	}

	@RequestMapping(value = "/museum/{id}", method = RequestMethod.DELETE)
	public String deleteMuseum(@PathVariable int id) {
		this.museumService.deleteMuseum(id);
		return "museum deleted";
	}

	@RequestMapping(value = "/museum/edit", method = RequestMethod.PUT)
	public String editMuseum(@RequestBody Museum museum) {
		this.museumService.editMuseum(museum);
		return museum.getName() + " edited";
	}
}
