package week1.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String revStr = "";
		char[] charArr = str.toCharArray();
		for (int i = charArr.length - 1; i >= 0; i--) {
			revStr = revStr + charArr[i];
		}
		if (str.equalsIgnoreCase(revStr)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not Palindrome");
		}
	}

}

