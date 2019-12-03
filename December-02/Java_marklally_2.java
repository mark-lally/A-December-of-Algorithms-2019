package dec2_credit_card;

public class Java_marklally_2 {

	static String ValidateCreditCard(long input) {
		
		int s1 = 0, s2 = 0, currentDigit = 0;
		
		// Reverse digits
		StringBuilder numStr = new StringBuilder(Long.toString(input));		
		numStr = numStr.reverse();
		
		for(int i=0; i < numStr.length(); i++) {
			
			currentDigit = Character.getNumericValue(numStr.charAt(i));
			
			// Odd digits
			if ((i+1)%2 != 0) 
				s1 += currentDigit; 
			// Even digits
			else 
				s2 += ((currentDigit * 2) < 9) ? currentDigit*2 : (1 + (currentDigit*2)%10);
			
		}		
		return ((s1 + s2)%10 == 0) ? input + " passes the test" : input + " does NOT pass the test";
	}
	
	
}
