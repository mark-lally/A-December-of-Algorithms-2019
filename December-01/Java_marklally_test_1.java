package dec1_sevenish_number;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Java_marklally_test_1 {
	
	Java_marklally_1 sev;
	
	@Before
	public void setup(){
		sev = new Java_marklally_1();
	}
	
	@Test
	public void test() {
		
		assertEquals(1, sev.sevenishNumber(1));
		assertEquals(7, sev.sevenishNumber(2));
		assertEquals(8, sev.sevenishNumber(3));
		assertEquals(49, sev.sevenishNumber(4));
		assertEquals(50, sev.sevenishNumber(5));
		assertEquals(350, sev.sevenishNumber(10));
	}
}
