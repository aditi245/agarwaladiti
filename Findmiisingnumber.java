package arrayprograms;

public class Findmiisingnumber {

	public static void main(String[] args) {

		
		int[] a = {1,2,3,4,6,7,8,9};
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, actualSum = 0; 
		
		for (int num : a) 
		{
			min = Math.min(min, num); 
			max = Math.max(max, num); 
			actualSum += num; } // Calculate the expected sum of the sequence from min to max 
		int expectedSum = (max * (max + 1) / 2) - (min * (min - 1) / 2); // The missing number is the difference between the expected sum and the actual sum 
		int missingNumber = expectedSum - actualSum; 
		System.out.println("The missing number is: " + missingNumber); 
		
		
		} 

}