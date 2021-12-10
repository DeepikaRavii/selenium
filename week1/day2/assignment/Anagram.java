package week1.day2.assignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potsa";
		boolean status = true;

		int len1 = text1.length();
		int len2 = text2.length();

		if (len1 == len2) {

			char[] charArr1 = text1.toCharArray();
			char[] charArr2 = text2.toCharArray();

			Arrays.sort(charArr1);
			Arrays.sort(charArr2);
			status=Arrays.equals(charArr1, charArr2);
			
		} else {
			status = false;
			
		}
		if (status == true) {
			System.out.println("String is Anagram");
		} else {
			System.out.println("String is not Anagram");
		}
		
	}

}
