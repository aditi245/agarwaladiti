package arrayprograms;

// WAP to find duplicate element in array using Set collection
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate_Using_forloop {

	public static void main(String[] args) {

		int a[] = {2, 3, 4, 5, 7, 2, 5, 8, 9, 9};
		

			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {

					
					System.out.println("duplicate element in array is :"+ a[i]);
				}

			}
		}}}