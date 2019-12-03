package dec1_sevenish_number;

/**
 * @author Mark Lally
 * 
 * A Sevenish Number is one which is either a power of seven
 * or the sum of unique powers of seven.
 * 
 * Eureka moment:   realising that the input number, expressed as sums of powers of 2,
 * 					returns the correct result if you convert to base 7.
 * 					
 * 					e.g..........10 = (2 to the power of 3) + (2 to the power of 1)
 * 					In base 7........ (7 to the power of 3) + (7 to the power of 1) = 350
 * 					So 10th sevenish number is 350
 * 
 * https://github.com/SVCE-ACM/A-December-of-Algorithms-2019#december-1---sevenish-number
 */
public class Java_marklally_1 {
	
	public int sevenishNumber(int input) {
		
		int result = 0;
		
		// convert input to binary number
		char[] test = Integer.toBinaryString(input).toCharArray();
		
		// check binary number for 1s, starting at least significant bit. (j is index)
		for(int i = test.length-1, j=0; i >= 0; i--, j++) {
			if(test[i] == '1') {
				// for each 1, add 7 to the power of the index
				result += Math.pow(7, j);
			}
		}
		return result;
	}
}
