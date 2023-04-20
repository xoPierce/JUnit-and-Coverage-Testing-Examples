package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1", "fname", "lname" ,"0123456789", "address qiasbfasfi");
		assertTrue(contact.getContactID().equals("1"));
		assertTrue(contact.getFirstName().equals("fname"));
		assertTrue(contact.getLastName().equals("lname"));
		assertTrue(contact.getPhone().equals("0123456789"));
		assertTrue(contact.getAddress().equals("address qiasbfasfi"));
	}
	
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			new Contact("01234567890", "fname", "lname" ,"0123456789", "address qiasbfasfi");
		});
	}
	
	@Test
	void testContactIDIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			new Contact(null, "fname", "lname" ,"0123456789", "address qiasbfasfi");
		});
	}
	
	@Test
	void testContactSetFirstName() {
		Contact contact = new Contact("0", "fname", "lname", "0123456789", "address");
		contact.setFirstName("new");
		assertTrue(contact.getFirstName().equals("new"));
	}
	
	@Test
	void testContactSetFirstNameTooLong() {
		Contact contact = new Contact("0", "fname", "lname", "0123456789", "address");
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			contact.setFirstName("Fname is really really really really really really really long");
		});
	}
	
	@Test
	void testContactSetFirstNameIsNull() {
		Contact contact = new Contact("0", "fname", "lname", "0123456789", "address");
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			contact.setFirstName(null);
		});
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			new Contact("1", "fnamenametoolong", "lname" ,"0123456789", "address qiasbfasfi");
		});
	}
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			new Contact("1", null, "lname" ,"0123456789", "address qiasbfasfi");
		});
	}
	
	@Test
	void testContactSetLastName() {
		Contact contact = new Contact("0", "fname", "lname", "0123456789", "address");
		contact.setLastName("new");
		assertTrue(contact.getLastName().equals("new"));
	}
	
	@Test
	void testContactSetLastNameTooLong() {
		Contact contact = new Contact("0", "fname", "lname", "0123456789", "address");
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			contact.setLastName("Lname is really really really really really really really long");
		});
	}
	
	@Test
	void testContactSetLastNameIsNull() {
		Contact contact = new Contact("0", "fname", "lname", "0123456789", "address");
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			contact.setFirstName(null);
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			new Contact("1", "fname", "lnametoolong" ,"0123456789", "address qiasbfasfi");
		});
	}
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			new Contact("1", "fname", null,"0123456789", "address qiasbfasfi");
		});
	}
	
	@Test
	void testContactPhoneNumber() {
		Contact contact = new Contact("0", "fname", "lname", "0123456789", "address");
		contact.setNumber("1234567890");
		assertTrue(contact.getPhone().equals("1234567890"));
	}
	
	@Test
	void testContactSetPhoneNumberTooLong() {
		Contact contact = new Contact("0", "fname", "lname", "0123456789", "address");
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			contact.setNumber("0123456789012364656");
		});
	}
	
	@Test
	void testContactSetPhoneNumberIsNull() {
		Contact contact = new Contact("0", "fname", "lname", "0123456789", "address");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setNumber(null);
		});
	}

	@Test
	void testContactPhoneNumTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "fname", "lname", "01234567890123", "address qiasbfasfi");
		});
	}

	@Test
	void testContactPhoneNumIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "fname", "lname", null, "address qiasbfasfi");
		});
	}
	
	@Test
	void testContactPhoneNumTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			new Contact("1", "fname", "lname" ,"0", "address qiasbfasfi");
		});
	}
	
	@Test
	void testContactSetAddress() {
		Contact contact = new Contact("0", "fname", "lname", "0123456789", "address");
		contact.setAddress("new");
		assertTrue(contact.getAddress().equals("new"));
	}
	
	@Test
	void testContactSetAddressTooLong() {
		Contact contact = new Contact("0", "fname", "lname", "0123456789", "address");
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			contact.setAddress("Address is really really really really really really really really really long");
		});
	}
	
	@Test
	void testContactSetAddressIsNull() {
		Contact contact = new Contact("0", "fname", "lname", "0123456789", "address");
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			contact.setAddress(null);
		});
	}
	
	@Test
	void testAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> { 
			new Contact("1", "fname", "lname" ,"0123456789", null);
		});
	}
}
