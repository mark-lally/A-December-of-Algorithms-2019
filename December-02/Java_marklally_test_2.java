package dec2_credit_card;

import static org.junit.Assert.*;

import org.junit.Test;

public class Java_marklally_test_2 {

	@Test
	public void testValidateCreditCard() {
		assertEquals("49927398716 passes the test", Java_marklally_2.ValidateCreditCard(49927398716L));
		assertEquals("12345674 passes the test", Java_marklally_2.ValidateCreditCard(12345674));
		assertEquals("123456789049 passes the test", Java_marklally_2.ValidateCreditCard(123456789049L));
		
		assertNotEquals("12141414141 passes the test", Java_marklally_2.ValidateCreditCard(12141414141L));
		assertNotEquals("2314461448685 passes the test", Java_marklally_2.ValidateCreditCard(2314461448685L));
	}

}
