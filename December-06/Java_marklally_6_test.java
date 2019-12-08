package dec6_fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class Java_marklally_6_test {

	@Test
	public void test() {

		assertEquals("2, 3, 5, 13, 89", Java_marklally_6.fibonacciGenerator(5));
		assertEquals("2, 3, 5, 13, 89, 233, 1597", Java_marklally_6.fibonacciGenerator(7));
		assertEquals("2, 3", Java_marklally_6.fibonacciGenerator(2));
		assertEquals("2", Java_marklally_6.fibonacciGenerator(1));
		assertEquals("2, 3, 5, 13, 89, 233, 1597, 28657, 514229", Java_marklally_6.fibonacciGenerator(9));
	}

}
