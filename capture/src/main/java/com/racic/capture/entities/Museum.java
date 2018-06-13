package com.racic.capture.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "museums")
public class Museum {

	@Id
	private int idmuseum = 0;
	@Column
	private String name;
	@Column
	private String city;
	@Column
	private String addressm;
	@Column
	private String type;

	@Column
	private String openHours;

	@Column
	private int tarif;
	// @OneToMany
	// private List<Photo> photos;

	@Column
	private double lat;
	@Column
	private double longi;

	public Museum(String name, String city, String addressm, String type, String openHours, List<Photo> photos,
			int tarif, double lat, double longi) {
		super();
		this.name = name;
		this.city = city;
		this.type = type;
		this.tarif = tarif;
		this.addressm = addressm;
		this.openHours = openHours;
		this.lat = lat;
		this.longi = longi;
	}

	public Museum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdmuseum() {
		return idmuseum;
	}

	public void setIdmuseum(int idmuseum) {
		this.idmuseum = idmuseum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressm() {
		return addressm;
	}

	public void setAddressm(String addressm) {
		this.addressm = addressm;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOpenHours() {
		return openHours;
	}

	public void setOpenHours(String openHours) {
		this.openHours = openHours;
	}

	public int getTarif() {
		return tarif;
	}

	public void setTarif(int tarif) {
		this.tarif = tarif;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLongi() {
		return longi;
	}

	public void setLongi(double longi) {
		this.longi = longi;
	}

}
