package com.racic.capture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.racic.capture.entities.Museum;
import com.racic.capture.repositories.MuseumRepository;

@Service
public class MuseumService implements IMuseumService {
	// private List<Museum> listMuseum;

	@Autowired
	private MuseumRepository mr;
	// @Autowired

	// private IPhotoService photoService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.racic.capture.services.IMuseumService#getListMuseum()
	 */
	@Override
	public List<Museum> getAll() {
		return mr.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.racic.capture.services.IMuseumService#setListMuseum(java.util.List)
	 * 
	 * 
	 * @PostConstruct public void museumServicePostConstruct() { /* this.listMuseum
	 * = new ArrayList<>(Arrays.asList( new Museum("Musée du Louvre ", "Paris",
	 * "Rue de Rivoli", "art", "9am-6pm", 15, photoService.getListPhoto().subList(0,
	 * 4), 48.8606, 2.3376), new Museum("Musée d\"Art Moderne de la Ville de Paris",
	 * "Paris", "Avenue du Président Wilson", "art", "10am-6pm", 7,
	 * photoService.getListPhoto().subList(4, 8), 48.8643, 2.2978), new
	 * Museum("Muséum National d\"Histoire Naturelle", "Paris", "Rue Voltaire",
	 * "natural history", "9am-5pm", 10, photoService.getListPhoto().subList(8, 12),
	 * 48.8443, 2.3562), new Museum("Musée d\"Orsay", "Paris",
	 * "Rue de la Légion d\"Honneur", "art", "9:30am-6pm", 12,
	 * photoService.getListPhoto().subList(12, 16), 48.8600, 2.3266), new
	 * Museum("Musée de l\"Orangerie", "Paris", " Jardin Tuileries", "art",
	 * "9am-6pm", 9, photoService.getListPhoto().subList(16, 20), 48.8638, 2.3227),
	 * new Museum("Fondation Louis Vuitton", "Paris", " Avenue du Mahatma Gandhi",
	 * "art", "10am-8pm", 5, photoService.getListPhoto().subList(20, 24), 48.8766,
	 * 2.2634)));
	 */

	@Override
	public Museum getMuseumById(int id) {
		// Museum m = null;

		/*
		 * for (int i = 0; i < this.listMuseum.size(); i++) { if
		 * (this.listMuseum.get(i).getId() == id) { m = this.listMuseum.get(i); } }
		 */
		return mr.getOne(id);

	}

	/*
	 * public IPhotoService getPhotoService() { return photoService; }
	 * 
	 * public void setPhotoService(IPhotoService photoService) { this.photoService =
	 * photoService; }
	 * 
	 * @Override public List<Photo> getListPhoto() { // TODO Auto-generated method
	 * stub return null; }
	 * 
	 * @Override public void setListPhoto(List<Photo> listPhoto) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void setListUser(List<User> listUser) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

	@Override
	public void addMuseum(Museum museum) {
		// System.out.println(museum);
		this.mr.save(museum);
		// return "ok";
	}

	@Override
	public String deleteMuseum(int id) {
		this.mr.deleteById(id);
		return "museum deleted";
	}

	public MuseumRepository getMr() {
		return mr;
	}

	public void setMr(MuseumRepository mr) {
		this.mr = mr;
	}

	@Override
	public void editMuseum(Museum museum) {

		this.mr.save(museum);
		// return "museum edited";
	}

	// @Override
	// public List<Museum> getListMuseum() {
	// TODO Auto-generated method stub
	// return null;
	// }
}
