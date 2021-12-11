package week3.assignment;

public class StringReplace {

	public static void main(String[] args) {

		String sentence = "I am working with Java8";
		System.out.println("Before Replacement");
		System.out.println(sentence);
		
		// String Replace 8 to 11 
		String str = "";
		str = sentence.replace("8", "11");
		
		System.out.println("After Replacement");
		System.out.println(str);
		
		//Print the characters from 5 to 14
		char[] charArray = sentence.toCharArray();
		for (int i = 5; i <= 14; i++) {
			System.out.println(charArray[i]);
		}
		
	
		
	}

}
