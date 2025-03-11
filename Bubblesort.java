package arrayprograms;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {

		int [] a = {4,9,34,5,6,89};
		int b = a.length;
		
		int temp ;
		//output : 4,5,6,9,34,89
		
		for(int i=0;i<b-1;i++) {  // i<b-1 i.e once last ement is sorted will not search again
			
			for(int j=0;j<b;j++) 
			{
				
				
				if(a[j].compareTo(a[j+1])>0)
				{
				temp =a[j+1];
				a[j+1]= a[i];
				a[i] = temp;
	
			}}}	
			
			for(int i=0;i<b;i++) {
				
				System.out.print(a[i] + " ");
		
			}}}
	