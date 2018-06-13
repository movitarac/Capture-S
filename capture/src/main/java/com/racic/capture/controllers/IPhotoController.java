package com.racic.capture.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.racic.capture.entities.Photo;

public interface IPhotoController {

	List<Photo> getAll();

}