package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		// object is created for your string

		// Literals( data)
		//String strTest1 = "Welcome to testleaf";
		// new operator
		// new memory is allocated and stored

		String strTest = "Welcome to testleaf";

		// 1. String Length: method
		int strLen = strTest.length();
		System.out.println("The of the String is : " + strLen);

		// 2. Find a character in a String:( give position)
		System.out.println("The 5'th position of the String is : " + strTest.charAt(5));

		// 3. Get the position of a character in the string:( first occurence)
		int indexOf = strTest.indexOf('e');
		System.out.println("The First Position of 'e' : " + indexOf);

		// 4. Get the last position of a character in the string:
		int lastIndexOf = strTest.lastIndexOf('e');
		System.out.println("The Last Position of 'e' : " + lastIndexOf);

		// 5.Convert a string to a character array:
     	System.out.println(" Complete string is :" + strTest);
		char[] charArray = strTest.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);

		}
		
		// 6. Convert a string to words:
		// Welcome-to-testleaf
		String[] split = strTest.split(" ");
		for (int j = 0; j < split.length; j++) {
			System.out.println("Split [" +j+ "] :"+split[j]);
		}
		
		// 7. Get a part of the string:
		String subStr = strTest.substring(8);
		System.out.println("The Sub-String of the String is : "+subStr);
		
		String subStr1 = strTest.substring(8,15);
		System.out.println("The Sub-String of the String is : "+subStr1);
		
		// 8. Replace a character:
		String replace = strTest.replace('e','E');
		System.out.println("Replaced String : "+replace);
		
		// 9. Replace all the integers, non integers:
		String str1 = "TestLeaf-102839";
		// \\d - Integers
		// \\D - Non Integers
		String replace1 = str1.replaceAll("\\d", " "); // - Replace all the non integers by null(all except numbers)
		String replace2 = str1.replaceAll("\\D", " ");
		System.out.println("Replaced String : "+replace1); 
		System.out.println("Replaced String : "+replace2);
		
		// 10. Compare two strings:
		String str3 = "TestLeaf";
		String str2 = "TestLeaf";
		
		String strNew = new String("amma");
		String strNew1 = new String("amma");
		
		if (str3.equals(str2)) {
			System.out.println("The is Equal");
		} else {
			System.out.println("The is Not Equal");
		}
		
		if (strNew==strNew1) {
			System.out.println("The String Located in Same Location");
		} else {
			System.out.println("The String Located in Different Location");
		}
		
	}

}
