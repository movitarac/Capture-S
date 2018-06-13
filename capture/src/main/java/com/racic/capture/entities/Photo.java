package com.racic.capture.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "photos")
public class Photo {

	@Id
	private int idphoto = 0;

	@Column
	private String nameP;
	@Column
	private String photoTitle;
	@Column
	private String cameraBrand;
	@Column
	private String focal;
	@Column
	private String apeture;
	@Column
	private int isoCam;
	@Column
	private String shutterSpeed;
	@Column
	private String flash;
	@Column
	private String star;
	@Column
	private String reviewPos;
	@Column
	private String reviewNeg;
	@ManyToOne
	@JoinColumn(name = "userid")
	private User user;
	@ManyToOne
	@JoinColumn(name = "museumid")
	private Museum museum;
	// https://stackoverflow.com/questions/8572072/jpa-jointable-and-two-joincolumns

	public Photo(String nameP, String photoTitle, String cameraBrand, String focal, String apeture, String shutterSpeed,
			String flash, int isoCam, String star, String reviewPos, String reviewNeg, User user, Museum museum) {
		super();
		this.nameP = nameP;
		this.photoTitle = photoTitle;
		this.cameraBrand = cameraBrand;
		this.focal = focal;
		this.apeture = apeture;
		this.isoCam = isoCam;
		this.shutterSpeed = shutterSpeed;
		this.flash = flash;
		this.star = star;
		this.reviewPos = reviewPos;
		this.reviewNeg = reviewNeg;
		this.user = user;
		this.museum = museum;
	}

	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdphoto() {
		return idphoto;
	}

	public void setIdphoto(int idphoto) {
		this.idphoto = idphoto;
	}

	public String getNameP() {
		return nameP;
	}

	public void setNameP(String nameP) {
		this.nameP = nameP;
	}

	public String getPhotoTitle() {
		return photoTitle;
	}

	public void setPhotoTitle(String photoTitle) {
		this.photoTitle = photoTitle;
	}

	public String getCameraBrand() {
		return cameraBrand;
	}

	public void setCameraBrand(String cameraBrand) {
		this.cameraBrand = cameraBrand;
	}

	public String getFocal() {
		return focal;
	}

	public void setFocal(String focal) {
		this.focal = focal;
	}

	public String getApeture() {
		return apeture;
	}

	public void setApeture(String apeture) {
		this.apeture = apeture;
	}

	public int getIsoCam() {
		return isoCam;
	}

	public void setIsoCam(int isoCam) {
		this.isoCam = isoCam;
	}

	public String getShutterSpeed() {
		return shutterSpeed;
	}

	public void setShutterSpeed(String shutterSpeed) {
		this.shutterSpeed = shutterSpeed;
	}

	public String getFlash() {
		return flash;
	}

	public void setFlash(String flash) {
		this.flash = flash;
	}

	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public String getReviewPos() {
		return reviewPos;
	}

	public void setReviewPos(String reviewPos) {
		this.reviewPos = reviewPos;
	}

	public String getReviewNeg() {
		return reviewNeg;
	}

	public void setReviewNeg(String reviewNeg) {
		this.reviewNeg = reviewNeg;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Museum getMuseum() {
		return museum;
	}

	public void setMuseum(Museum museum) {
		this.museum = museum;
	}

	@Override
	public String toString() {
		return "Photo [idphoto=" + idphoto + ", nameP=" + nameP + ", photoTitle=" + photoTitle + ", cameraBrand="
				+ cameraBrand + ", focal=" + focal + ", apeture=" + apeture + ", isoCam=" + isoCam + ", shutterSpeed="
				+ shutterSpeed + ", flash=" + flash + ", star=" + star + ", reviewPos=" + reviewPos + ", reviewNeg="
				+ reviewNeg + ", user=" + user + ", museum=" + museum + "]";
	}

}
