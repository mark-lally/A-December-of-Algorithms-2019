package dec7_queued_up;

import static org.junit.Assert.*;

import org.junit.Test;

public class Java_marklally_7_test {

	@Test
	public void test() {

		assertEquals("The order is:\n(3, c)\n(1, a)\n(2, b)\n(4, d)\n(5, e)\n", Java_marklally_7.queueUp());
	}

}
