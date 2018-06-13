package com.racic.capture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaptureApplication {
	// on ne veut pas mettre xml pour faire scan, c'est pourquoi on met d'autre
	// package au desous
	// de package main
	public static void main(String[] args) {
		SpringApplication.run(CaptureApplication.class, args);
	}
}
