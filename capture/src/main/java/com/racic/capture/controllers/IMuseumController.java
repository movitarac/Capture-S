package com.racic.capture.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.racic.capture.entities.Museum;
import com.racic.capture.services.IMuseumService;

public interface IMuseumController {

	IMuseumService getMuseumService();

	void setMuseumService(IMuseumService museumService);

	List<Museum> getAll();

}