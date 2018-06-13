package com.racic.capture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.racic.capture.entities.User;
import com.racic.capture.repositories.UserRepository;

@Service
public class UserService implements IUserService {
	// private List<User> listUser;
	@Autowired
	private UserRepository ur;

	public UserService() {
		/*
		 * this.listUser = new ArrayList<>(Arrays.asList( new User("Azura", "Mamoto",
		 * "azura.mamoto@yahoo.co.id", "az12345", "rue de tomjerry", "mariazura"), new
		 * User("Capucine", "Grazie", "azura.mamoto@yahoo.co.id", "az12345",
		 * "rue de powerpuff", "beesy_black"), new User("Totoro", "Tororo",
		 * "azura.mamoto@yahoo.co.id", "abcdefgh", "rue de donut", "moonlightfalls"),
		 * new User("Azura", "Mamoto", "azura.mamoto@yahoo.co.id", "ab123",
		 * "rue de star", "vitazura"), new User("Momo", "Taro",
		 * "azura.mamoto@yahoo.co.id", "c123", "rue de trek", "marukochan"), new
		 * User("Huruhara", "Holi", "azura.mamoto@yahoo.co.id", "qwerty345",
		 * "rue de dauphin", "moonlightyellow"), new User("Carola", "Coila",
		 * "azura.mamoto@yahoo.co.id", "azerty1", "rue de hamster", "busybee"), new
		 * User("Holis", "Molis", "azura.mamoto@yahoo.co.id", "abcdef55",
		 * "rue de figaro", "marukochan")));
		 */
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.racic.capture.services.IUserService#getListUser()
	 */
	@Override
	public List<User> getAll() {
		return ur.findAll();
	}

	@Override
	public User find(String userName) {
		return ur.findOneByUsername(userName);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.racic.capture.services.IUserService#setListUser(java.util.List)
	 */

	@Override
	public String addUser(User user) {
		System.out.println(user);
		this.ur.save(user);
		return "ok";
	}

	public User getUserById(int id) {
		// User u = null;
		/*
		 * for (int i = 0; i < this.listUser.size(); i++) { if
		 * (this.listUser.get(i).getIduser() == id) { u = this.listUser.get(i); } }
		 */
		return ur.getOne(id);
	}

	public User save(User user) {
		return ur.saveAndFlush(user);
	}

	@Override
	public String deleteUser(int id) {
		this.ur.deleteById(id);
		// this.listUser.remove(id);
		return "user deleted";
	}

	@Override
	public String editUser(User user) {
		/*
		 * for (User us : listUser) { if (us.getIduser() == user.getIduser()) {
		 * us.setAddress(user.getAddress()); us.setEmail(user.getEmail());
		 * us.setFirstName(user.getFirstName()); us.setLastName(user.getLastName());
		 * us.setPassword(user.getPassword()); us.setUsername(user.getUsername());
		 * 
		 * } } System.out.println(this.listUser.get(7).getFirstName());
		 */
		this.ur.save(user);
		return "user edited";
	}

	@Override
	public UserRepository getUr() {
		return ur;
	}

	@Override
	public void setUr(UserRepository ur) {
		this.ur = ur;
	}

}
