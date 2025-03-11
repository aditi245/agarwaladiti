package arrayprograms;

import java.util.Arrays;

public class Anagramornot {

	String s,ang;
	public static void main(String[] args) {

		String s ="cat";
		String ang="act";
		
		char[]ch=s.toCharArray();
		
		char[]ch1 =ang.toCharArray();
		 Arrays.sort(ch);
		Arrays.sort(ch1);
	
		
//Arrays.equals(ch, ch1));
System.out.println(Arrays.equals(ch, ch1));		

	}

}
