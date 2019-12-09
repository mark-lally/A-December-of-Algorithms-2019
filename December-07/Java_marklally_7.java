package dec7_queued_up;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class Java_marklally_7 {
	
	
	static Scanner scan; 
	static LinkedBlockingDeque<String> q;
	static HashMap<String, Integer> indexes;
	
	static String queueUp() {
		
		String current = ""; 
		StringBuilder result = new StringBuilder();
		
		scan = new Scanner(System.in);
		System.out.print("Enter N: ");
		int N = scan.nextInt();
		q = new LinkedBlockingDeque<String>(N);
		indexes = new HashMap<String, Integer>(N);
		
		System.out.println("Enter id: ");
		for(int i=0; i<N; i++) {
			System.out.print(i+1 + ":");
			current = scan.next();
			q.add(current);
			indexes.put(current,i+1);
		}
		
		System.out.print("Enter k: ");
		String k = scan.next();
		q.remove(k); q.addFirst(k);
		
		result.append("The order is:\n"); 
		for(String c: q) {
			result.append("("+indexes.get(c)+", "+c+")\n");
		}
		return result.toString();
		
	}
	
}
