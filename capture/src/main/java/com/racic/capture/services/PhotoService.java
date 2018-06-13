package com.racic.capture.services;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.racic.capture.entities.Photo;
import com.racic.capture.repositories.PhotoRepository;

@Service
public class PhotoService implements IPhotoService {
	// private List<Photo> listPhoto;
	@Autowired
	private PhotoRepository pr;

	@PostConstruct
	public void photoServicePostConstruct() {
		/*
		 * this.listPhoto = new ArrayList<>(Arrays.asList( new Photo("louvre.jpg",
		 * " The Louvre ", "Canon EOS M3", "50mm", "f/6.0", "1/60", "no", 3200, "9",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(0).getUsername()), new Photo("louvre1.jpg",
		 * " The Louvre ", "Sony AX10", "50mm", "f/5.0", "1/60", "no", 600, "8",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(1).getUsername()), new Photo("louvre2.jpg",
		 * " The Louvre ", "Canon EM1", "40mm", "f/6.0", "1/100", "no", 100, "6",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(2).getUsername()), new Photo("louvre3.jpg",
		 * " The Louvre ", "Sony AX20", "60mm", "f/7.0", "1/60", "no", 400, "7",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(3).getUsername()), new Photo("mamvp.jpg",
		 * " M A M V P ", "Canon EOS M3", "50mm", "f/6.0", "1/60", "no", 3200, "9",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(4).getUsername()), new Photo("mamvp1.jpg",
		 * " M A M V P ", "Sony DS10", "50mm", "f/5.0", "1/60", "no", 600, "8",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(5).getUsername()), new Photo("mamvp2.jpg",
		 * " M A M V P ", "Canon EM5", "40mm", "f/6.0", "1/100", "no", 100, "6",
		 * "lots of collection and museum is so big",
		 * " the receptionist was not friendly and need time to discover all the collection"
		 * , userService.getListUser().get(5).getUsername()), new Photo("mamvp3.jpg",
		 * " Musée d\"Art Moderne de la Ville de Paris ", "Fuji AX100", "60mm", "f/7.0",
		 * "1/60", "no", 400, "7", "lots of collection and museum is so big",
		 * " the receptionist was not friendly and need time to discover all the collection"
		 * , userService.getListUser().get(6).getUsername()), new
		 * Photo("histoireNat.jpg", " Museum Natural History ", "Canon EOS M3", "50mm",
		 * "f/6.0", "1/60", "no", 3200, "9", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(0).getUsername()), new
		 * Photo("histoireNat1.jpg", " Museum Natural History ", "Sony DS10", "50mm",
		 * "f/5.0", "1/60", "no", 600, "8", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(1).getUsername()), new
		 * Photo("histoireNat2.jpg", " Museum Natural History ", "Canon EM5", "40mm",
		 * "f/6.0", "1/100", "no", 100, "6", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(2).getUsername()), new
		 * Photo("histoireNat3.jpg", " Museum Natural History ", "Fuji AX100", "60mm",
		 * "f/7.0", "1/60", "no", 400, "7", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(3).getUsername()), new Photo("orsay.jpg",
		 * " Musée d\"Orsay ", "Canon EOS M3", "50mm", "f/6.0", "1/60", "no", 3200, "9",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(5).getUsername()), new Photo("orsay1.jpg",
		 * " Musée d\"Orsay ", "Sony DS10", "50mm", "f/5.0", "1/60", "no", 600, "8",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(6).getUsername()), new Photo("orsay2.jpg",
		 * " Musée d\"Orsay ", "Canon EM5", "40mm", "f/6.0", "1/100", "no", 100, "6",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(1).getUsername()), new Photo("orsay3.jpg",
		 * " Musée d\"Orsay ", "Fuji AX100", "60mm", "f/7.0", "1/60", "no", 400, "7",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(5).getUsername()), new Photo("orange.jpg",
		 * " Musée de l\"Orangerie ", "Canon EOS M3", "50mm", "f/6.0", "1/60", "no",
		 * 3200, "9", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(2).getUsername()), new Photo("orange1.jpg",
		 * " Musée de l\"Orangerie ", "Sony DS10", "50mm", "f/5.0", "1/60", "no", 600,
		 * "8", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(3).getUsername()), new Photo("orange2.jpg",
		 * " Musée de l\"Orangerie ", "Canon EM5", "40mm", "f/6.0", "1/100", "no", 100,
		 * "6", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(2).getUsername()), new Photo("orange3.jpg",
		 * " Musée de l\"Orangerie ", "Fuji AX100", "60mm", "f/7.0", "1/60", "no", 400,
		 * "7", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(4).getUsername()), new Photo("flv.jpg",
		 * " Foundation LV ", "Nikon D5000", "70mm", "f/4.0", "1/30", "no", 3200, "8",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(1).getUsername()), new Photo("flv1.jpg",
		 * " Foundation LV ", "Pentax QS1", "60mm", "f/3.0", "1/40", "no", 1600, "7",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(2).getUsername()), new Photo("flv2.jpg",
		 * " Foundation LV ", "Pentax K1", "100mm", "f/3.0", "1/40", "no", 200, "6",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(6).getUsername()), new Photo("flv3.jpg",
		 * " Foundation LV ", "Olympus M II ", "60mm", "f/3.0", "1/40", "no", 800, "9",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * userService.getListUser().get(5).getUsername())));
		 */
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.racic.capture.services.IPhotoService#getListPhoto()
	 */
	@Override
	public List<Photo> getAll() {
		return pr.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.racic.capture.services.IPhotoService#setListPhoto(java.util.List)
	 */
	// @Override
	// public void setListPhoto(List<Photo> listPhoto) {
	// this.listPhoto = listPhoto;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.racic.capture.services.IPhotoService#getUserService()
	 */
	// @Override
	// public IUserService getUserService() {
	// return userService;
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.racic.capture.services.IPhotoService#setUserService(com.racic.capture.
	 * services.IUserService)
	 */
	/*
	 * @Override public void setUserService(IUserService userService) { //
	 * this.userService = userService; }
	 */

	@Override
	public Photo getPhotoById(int id) {
		// Photo p = null;
		/*
		 * for (int i = 0; i < this.listPhoto.size(); i++) { if
		 * (this.listPhoto.get(i).getIdentification() == id) { p =
		 * this.listPhoto.get(i); } }
		 */
		return pr.getOne(id);
	}

	@Override
	public String addPhoto(Photo photo) {
		// System.out.println(photo);
		this.pr.save(photo);
		return "ok";
	}

	public PhotoRepository getPr() {
		return pr;
	}

	public void setPr(PhotoRepository pr) {
		this.pr = pr;
	}

	@Override
	public String deletePhoto(int id) {
		this.pr.deleteById(id);
		return "photo deleted";
	}

	@Override
	public String editPhoto(Photo photo) {

		this.pr.save(photo);
		return "photo edited";
	}

	/*
	 * @Override public List<Photo> getListPhoto() { // TODO Auto-generated method
	 * stub return null; }
	 */
}
