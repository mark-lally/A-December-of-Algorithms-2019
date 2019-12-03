package dec3_the_decimation;

public class Java_marklally_3 {
	
	static int[] decimate(int[] input) {

		// check if array has length of 1
		if(input.length <= 1)
			return input;
		
		// check if input is sorted
		for(int i=1; i<input.length;i++) {
			// if not sorted, snap first half away and recheck
			if(input[i] < input[i-1]) {
				int[] snapped = java.util.Arrays.copyOfRange(input, (input.length)/2, input.length);
				return decimate(snapped);
			}
		}
		// only reaches here if original input array is sorted
		return input;
	}
}
