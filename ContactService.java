package contact;
import java.util.ArrayList;

public class ContactService {

	// Instance Fields
	private ArrayList<Contact> contactList;
	
	// Constructor
	public ContactService() {
		contactList = new ArrayList<Contact>();
	}
	
	// Accessor
	public ArrayList<Contact> getContactList() {
		return contactList;
	}
	
	// Method to add a contact to the contact list with a unique ID
	public boolean addContact(String ID, String firstName, String lastName, String phone, String address) {
		Contact contact = search(ID);
		if (contact == null) {
			Contact newContact = new Contact(ID, firstName, lastName, phone, address);
			contactList.add(newContact);
			return true;
		}
		return false;
	}
	
	// Method to delete a contact from the contact list with a unique ID
	public void deleteContact(String contactID) {
		Contact contact = search(contactID);
		if (contact != null) {
			contactList.remove(contact);
		}
		else {
			throw new IllegalArgumentException("Cannot delete contact.");
		}
	}
	
	// Method to update the first name field
	public void updateFirstName(String contactID, String newFirstName) {
		Contact contact = search(contactID);
		if (contact != null) {
			contact.setFirstName(newFirstName);
		}
		else {
			throw new IllegalArgumentException("Cannot update first name.");
		}
	}
	
	// Method to update the last name field
	public void updateLastName(String contactID, String newLastName) {
		Contact contact = search(contactID);
		if (contact != null) {
			contact.setLastName(newLastName);
		}
		else {
			throw new IllegalArgumentException("Cannot update last name.");
		}	
	}
	
	// Method to update the number field
	public void updateNumber(String contactID, String newNumber) {
		Contact contact = search(contactID);
		if (contact != null) {
			contact.setNumber(newNumber);
		}
		else {
			throw new IllegalArgumentException("Cannot update the phone number.");
		}	
	}
	
	// Method to update the address field
	public void updateAddress(String contactID, String newAddress) {
		Contact contact = search(contactID);
		if (contact != null) {
			contact.setAddress(newAddress);
		}
		else {
			throw new IllegalArgumentException("Cannot update address.");
		}	
	}
	
	public Contact search(String contactID) {
		Contact searched_contact = null;
		for (Contact contact: contactList) {
			if (contact.getContactID().equals(contactID)) {
				return contact;
			}
		}
		return searched_contact;
	}
}