package arrayprograms;

public class Insertnoinarray {

	public static void main(String[] args) {

		
		int[] a = {1,6,9,12,45,8};   // initialize array 
		
		int position = 4;
		int element = 100;
		int lt = a.length;  // 7-1 =6
		// traversing from back i.e.8 
		for(int i=lt-1;i>position-1;i--) {
			
			a[i]= a[i-1];
		}
		a[position-1]= element;  // insert element on 4th position
			for(int i =0;i<lt;i++) {
				System.out.println(a[i] );

			}
	}
}