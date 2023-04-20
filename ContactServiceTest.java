package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	@Test
	void testContactService() {
		ContactService cS = new ContactService();
		assertTrue(cS.getContactList().isEmpty() == true);
	}
	
	@Test
	void testContactServiceAddContact() {
		ContactService contactService = new ContactService();
		assertTrue(contactService.addContact("1", "fname", "lname", "0123456789", "address"));
	}
	
	@Test
	void testContactServiceAddContactInvalidID() {
		ContactService contactService = new ContactService();
		contactService.addContact("1", "fname", "lname", "0123456789", "address");
		assertFalse(contactService.addContact("1", "fname", "lname", "0123456789", "address"));
	}
	
	@Test
	void testContactServiceUpdateFirstName() {
		ContactService cS = new ContactService();
		cS.addContact("1", "fname", "lname", "0123456789", "address");
		cS.updateFirstName("1", "newFName");
		assertTrue(cS.search("1").getFirstName().equals("newFName"));
	}
	
	@Test void testContactServiceUpdateFirstNameWithInvalidID() {
		ContactService cS = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			cS.updateFirstName("3", "new name");
		});
	}
	
	@Test
	void testContactServiceUpdateLastName() {
		ContactService cS = new ContactService();
		cS.addContact("1", "fname", "lname", "0123456789", "address");
		cS.updateLastName("1", "newLName");
		assertTrue(cS.search("1").getLastName().equals("newLName"));
	}
	
	@Test void testContactServiceUpdateLastNameWithInvalidID() {
		ContactService cS = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			cS.updateLastName("3", "new");
		});
	}
	
	@Test
	void testContactServiceUpdatePhoneNumber() {
		ContactService cS = new ContactService();
		cS.addContact("1", "fname", "lname", "0123456789", "address");
		cS.updateNumber("1", "1234567890");
		assertTrue(cS.search("1").getPhone().equals("1234567890"));
	}
	
	@Test void testContactServiceUpdatePhoneNumberWithInvalidID() {
		ContactService cS = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			cS.updateNumber("3", "new");
		});
	}
	
	@Test
	void testContactServiceUpdateAddress() {
		ContactService cS = new ContactService();
		cS.addContact("1", "fname", "lname", "0123456789", "address");
		cS.updateAddress("1", "new adress");
		assertTrue(cS.search("1").getAddress().equals("new adress"));
	}
	
	@Test void testContactServiceUpdateAddressWithInvalidID() {
		ContactService cS = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			cS.updateAddress("3", "new");
		});
	}
	
	@Test
	void testContactServiceDeleteContact() {
		ContactService cS = new ContactService();
		cS.addContact("1", "fname", "lname", "0123456789", "address");
		cS.deleteContact("1");
		assertTrue(cS.search("1") == null);
	}
	
	@Test
	void testContactServiceDeleteContactWithInvalidID() {
		ContactService cS = new ContactService();
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			cS.deleteContact("3");
		});
	}
}
