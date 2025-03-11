package arrayprograms;
// WAP to find duplicate element in array using Set collection
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {

		int a[]= {2,3,4,5,7,2,5,8,9,9};
	 
		 
        Set<Integer> all = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

												 
        for (int value1 : a) {
            if (all.add(value1)) {
            	duplicate.add(value1);
            }
        }

												
            all.removeAll(duplicate);

            System.out.print("Unique values: ");
            
            for (int value : all) {
                System.out.print(value + " ");
            }

           
    }
}
		
		
