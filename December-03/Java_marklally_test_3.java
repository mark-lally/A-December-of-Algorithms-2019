package dec3_the_decimation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Java_marklally_test_3 {
	
	int[] testCase1, testCase2, testCase3, expected1, expected3;
	
	@Before
	public void setUp() {
		testCase1 = new int[] {1, 2, 3, 4, 3};
		expected1 = new int[] {3};
		
		testCase2 = new int[] {1, 2, 3, 4, 5};
		
		testCase3 = new int[] {3, 4, 3, 6, 5, 8, 3, 1};
		expected3 = new int[] {1};
	}
	
	@Test
	public void test() {
		
		assertArrayEquals(expected1, Java_marklally_3.decimate(testCase1) );
		assertArrayEquals(testCase2, Java_marklally_3.decimate(testCase2) );
		assertArrayEquals(expected3, Java_marklally_3.decimate(testCase3) );
	}

}
