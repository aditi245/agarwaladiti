package arrayprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_And_Unique_element {

	public static void main(String[] args) {

		 int[] a = {2, 3, 4, 5, 7, 2, 5, 8, 9, 9,9};

	        Set<Integer> allElements = new HashSet<>();
	        Set<Integer> duplicates = new HashSet<>();
	        List<Integer> uniqueElements = new ArrayList<>();

	        // Identify all elements and duplicates
	        for (int value : a) {
	            if (!allElements.add(value)) {
	                duplicates.add(value);
	            }
	        }

	        // Identify unique elements that are not in duplicates
//	        for (int value : a) {
//	            if (!duplicates.contains(value)) {
//	                uniqueElements.add(value);
//	            }
//	        }

	        // Print the duplicate elements
	        System.out.println("Duplicate values: " + duplicates);

	        // Print the unique elements
	        System.out.println("Unique values: " + uniqueElements);
	    }
	
	}


