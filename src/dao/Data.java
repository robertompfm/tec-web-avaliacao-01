package dao;

import java.util.ArrayList;
import java.util.List;

import model.Contact;
import model.User;

public class Data {

	private static Data data = new Data();
	private List<Contact> contacts;
	private List<User> users;
	
	private Data() {
		this.contacts = new ArrayList<Contact>();
		this.users = new ArrayList<User>();
		this.contacts.add(new Contact(
				"Roberto", 
				"robertompfm@gmail.com", 
				"+55 (83) 98859-4919"
				));
		this.users.add(new User(
				"Roberto", 
				"robertompfm@gmail.com",
				"+55 (83) 98859-4919",
				"Cabedelo",
				"1234"
				));
	}

	public static Data getData() {
		return data;
	}

	public List<Contact> getContacts() {
		return contacts;
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public boolean addContact(Contact contact) {
		if (findContactByEmail(contact.getEmail()) != null) {
			return false;
		}
		if (findContactByPhone(contact.getPhone()) != null) {
			return false;
		}
		contacts.add(contact);
		return true;
	}

	public boolean addUser(User user) {
		if (findUserByEmail(user.getEmail()) != null) {
			return false;
		}
		if (findUserByPhone(user.getPhone()) != null) {
			return false;
		}
		users.add(user);
		return true;
	}
	
	public Contact findContactByPhone(String phone) {
		for (Contact contact : contacts) { 
			if (contact.getPhone().equals(phone)) {
				return contact;
			}
		}
		return null;
	}
	
	public Contact findContactByEmail(String email) {
		for (Contact contact : contacts) {
			if (contact.getEmail().equals(email)) {
				return contact;
			}
		}
		return null;
	}
	
	public User findUserByPhone(String phone) {
		for (User user : users) {
			if (user.getPhone().equals(phone)) {
				return user;
			}
		}
		return null;
	}
	
	
	public User findUserByEmail(String email) {
		for (User user : users) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}
	
	

	
	
}
