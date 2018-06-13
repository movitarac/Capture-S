package com.racic.capture.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.racic.capture.entities.Museum;
import com.racic.capture.entities.Photo;
import com.racic.capture.entities.User;

//1.gerer ca en tant que bean (pour declarer que c"est un bean) -@Controller a été remplacé par responsebody
@RestController // = @ReponseBody sur toutes les méthodes

public class HomeController {

	private List<Museum> listMuseum;
	private List<Photo> listPhoto;
	private List<User> listUser;

	HomeController() {
		/*
		 * this.listUser = Arrays.asList( new User("Azura", "Mamoto",
		 * "azura.mamoto@yahoo.co.id", "az12345", "rue de tomjerry", "mariazura"), new
		 * User("Capucine", "Grazie", "azura.mamoto@yahoo.co.id", "az12345",
		 * "rue de powerpuff", "beesy_black"), new User("Azura", "Mamoto",
		 * "azura.mamoto@yahoo.co.id", "az12345", "rue de tomjerry", "mariazura"), new
		 * User("Totoro", "Tororo", "azura.mamoto@yahoo.co.id", "abcdefgh",
		 * "rue de donut", "moonlightfalls"), new User("Azura", "Mamoto",
		 * "azura.mamoto@yahoo.co.id", "ab123", "rue de star", "vitazura"), new
		 * User("Momo", "Taro", "azura.mamoto@yahoo.co.id", "c123", "rue de trek",
		 * "marukochan"), new User("Huruhara", "Holi", "azura.mamoto@yahoo.co.id",
		 * "qwerty345", "rue de dauphin", "moonlightyellow"), new User("Carola",
		 * "Coila", "azura.mamoto@yahoo.co.id", "azerty1", "rue de hamster", "busybee"),
		 * new User("Holis", "Molis", "azura.mamoto@yahoo.co.id", "abcdef55",
		 * "rue de figaro", "marukochan"));
		 * 
		 * this.listPhoto = Arrays.asList( new Photo("louvre.jpg", " The Louvre ",
		 * "Canon EOS M3", "50mm", "f/6.0", "1/60", "no", 3200, "9",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(1).getUsername()), new Photo("louvre1.jpg", " The Louvre ",
		 * "Sony AX10", "50mm", "f/5.0", "1/60", "no", 600, "8",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(1).getUsername()), new Photo("louvre2.jpg", " The Louvre ",
		 * "Canon EM1", "40mm", "f/6.0", "1/100", "no", 100, "6",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(1).getUsername()), new Photo("louvre3.jpg", " The Louvre ",
		 * "Sony AX20", "60mm", "f/7.0", "1/60", "no", 400, "7",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(1).getUsername()), new Photo("mamvp.jpg", " M A M V P ",
		 * "Canon EOS M3", "50mm", "f/6.0", "1/60", "no", 3200, "9",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(1).getUsername()), new Photo("mamvp1.jpg", " M A M V P ",
		 * "Sony DS10", "50mm", "f/5.0", "1/60", "no", 600, "8",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(1).getUsername()), new Photo("mamvp2.jpg", " M A M V P ",
		 * "Canon EM5", "40mm", "f/6.0", "1/100", "no", 100, "6",
		 * "lots of collection and museum is so big",
		 * " the receptionist was not friendly and need time to discover all the collection"
		 * , listUser.get(1).getUsername()), new Photo("mamvp3.jpg",
		 * " Musée d\"Art Moderne de la Ville de Paris ", "Fuji AX100", "60mm", "f/7.0",
		 * "1/60", "no", 400, "7", "lots of collection and museum is so big",
		 * " the receptionist was not friendly and need time to discover all the collection"
		 * , listUser.get(1).getUsername()), new Photo("histoireNat.jpg",
		 * " Museum Natural History ", "Canon EOS M3", "50mm", "f/6.0", "1/60", "no",
		 * 3200, "9", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(1).getUsername()), new Photo("histoireNat1.jpg",
		 * " Museum Natural History ", "Sony DS10", "50mm", "f/5.0", "1/60", "no", 600,
		 * "8", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(1).getUsername()), new Photo("histoireNat2.jpg",
		 * " Museum Natural History ", "Canon EM5", "40mm", "f/6.0", "1/100", "no", 100,
		 * "6", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(1).getUsername()), new Photo("histoireNat3.jpg",
		 * " Museum Natural History ", "Fuji AX100", "60mm", "f/7.0", "1/60", "no", 400,
		 * "7", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(1).getUsername()), new Photo("orsay.jpg", " Musée d\"Orsay ",
		 * "Canon EOS M3", "50mm", "f/6.0", "1/60", "no", 3200, "9",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(2).getUsername()), new Photo("orsay1.jpg", " Musée d\"Orsay ",
		 * "Sony DS10", "50mm", "f/5.0", "1/60", "no", 600, "8",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(0).getUsername()), new Photo("orsay2.jpg", " Musée d\"Orsay ",
		 * "Canon EM5", "40mm", "f/6.0", "1/100", "no", 100, "6",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(5).getUsername()), new Photo("orsay3.jpg", " Musée d\"Orsay ",
		 * "Fuji AX100", "60mm", "f/7.0", "1/60", "no", 400, "7",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(4).getUsername()), new Photo("orange.jpg",
		 * " Musée de l\"Orangerie ", "Canon EOS M3", "50mm", "f/6.0", "1/60", "no",
		 * 3200, "9", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(4).getUsername()), new Photo("orange1.jpg",
		 * " Musée de l\"Orangerie ", "Sony DS10", "50mm", "f/5.0", "1/60", "no", 600,
		 * "8", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(3).getUsername()), new Photo("orange2.jpg",
		 * " Musée de l\"Orangerie ", "Canon EM5", "40mm", "f/6.0", "1/100", "no", 100,
		 * "6", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(2).getUsername()), new Photo("orange3.jpg",
		 * " Musée de l\"Orangerie ", "Fuji AX100", "60mm", "f/7.0", "1/60", "no", 400,
		 * "7", "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(6).getUsername()), new Photo("flv.jpg", " Foundation LV ",
		 * "Nikon D5000", "70mm", "f/4.0", "1/30", "no", 3200, "8",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(5).getUsername()), new Photo("flv1.jpg", " Foundation LV ",
		 * "Pentax QS1", "60mm", "f/3.0", "1/40", "no", 1600, "7",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(4).getUsername()), new Photo("flv2.jpg", " Foundation LV ",
		 * "Pentax K1", "100mm", "f/3.0", "1/40", "no", 200, "6",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(3).getUsername()), new Photo("flv3.jpg", " Foundation LV ",
		 * "Olympus M II ", "60mm", "f/3.0", "1/40", "no", 800, "9",
		 * "lots of collection and museum is so big",
		 * " long queue and need time to discover all the collection",
		 * listUser.get(2).getUsername()));
		 * 
		 * this.listMuseum = Arrays.asList( new Museum("Musée du Louvre ", "Paris",
		 * "Rue de Rivoli", "art", "9am-6pm", 15, listPhoto, 48.8606, 2.3376), new
		 * Museum("Musée d\"Art Moderne de la Ville de Paris", "Paris",
		 * "Avenue du Président Wilson", "art", "10am-6pm", 7, listPhoto, 48.8643,
		 * 2.2978), new Museum("Muséum National d\"Histoire Naturelle", "Paris",
		 * "Rue Voltaire", "natural history", "9am-5pm", 10, listPhoto, 48.8443,
		 * 2.3562), new Museum("Musée d\"Orsay", "Paris", "Rue de la Légion d\"Honneur",
		 * "art", "9:30am-6pm", 12, listPhoto, 48.8600, 2.3266), new
		 * Museum("Musée de l\"Orangerie", "Paris", " Jardin Tuileries", "art",
		 * "9am-6pm", 9, listPhoto, 48.8638, 2.3227), new
		 * Museum("Fondation Louis Vuitton", "Paris", " Avenue du Mahatma Gandhi",
		 * "art", "10am-8pm", 5, listPhoto, 48.8766, 2.2634));
		 */
	}

	/*
	 * 2.mapper le url (avant c"etait avec webservlet) maintenant c"est
	 * requestmapping (on pourrait s"en servir pour mettre param) 3.spring (sans
	 * responsenbody) va prendre return "hello" pour creer un fichier (avec prefix
	 * et sufix) comme template et j2ee renvoyer le fichier mais avec responsebody,
	 * on va renvoyer directement le return de la methode
	 */
	@RequestMapping("/")
	public String hello() {
		return "hello";
	}
	/*
	 * @RequestMapping("/museum") public List<Museum> getListMuseum() { return
	 * listMuseum; }
	 * 
	 * public void setListMuseum(List<Museum> listMuseum) { this.listMuseum =
	 * listMuseum; }
	 * 
	 * @RequestMapping("/photo") public List<Photo> getListPhoto() { return
	 * listPhoto; }
	 * 
	 * public void setListPhoto(List<Photo> listPhoto) { this.listPhoto = listPhoto;
	 * }
	 * 
	 * @RequestMapping("/user") public List<User> getListUser() { return listUser; }
	 * 
	 * public void setListUser(List<User> listUser) { this.listUser = listUser; }
	 */
}
