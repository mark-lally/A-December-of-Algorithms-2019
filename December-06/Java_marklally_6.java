package dec6_fibonacci;

public class Java_marklally_6 {
	
	static String fibonacciGenerator(int upTo) {
		
		if(upTo < 1)  return "" ;
		if(upTo == 1) return "2";
		
		StringBuilder result = new StringBuilder("2, ");
		
		for(int curr=1,prev=1, count=1, temp=0; count<upTo;) {
			if(isPrime(curr + prev)) {
				result.append(curr + prev);  
				count++; // counts Fib Primes
				if(count != upTo) 
					result.append(", ");
			}
			// Regular Fibonacci sequence processing
			temp = prev;							
			prev = curr;							
			curr = curr + temp;						 
		}
		return result.toString();
	}
	
	static boolean isPrime (int n) {
		
		// Eliminate even numbers
		if(n % 2 == 0) return false;
		// Process odd numbers
		for(int i=3;i < Math.sqrt(n); i+=2) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
}
