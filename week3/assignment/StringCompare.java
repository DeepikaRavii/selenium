package week3.assignment;

public class StringCompare {

	public static void main(String[] args) {

		String str1 = "I am Learning Java";
		String str2 = "I am learning java";

		System.out.println("String 1 : " + str1);
		System.out.println("String 1 : " + str2);
		System.out.println("");
        
		//Compares the memory Location so result will be not same
		System.out.println("Case 1 : Using '==' operator ");
		if (str1 == str2) {
			System.out.println("Both are Same ");
		} else {
			System.out.println("Both are not Same ");
			System.out.println("");
		}
		
		/*Compares the content of the string, but equals are case-sensitive.
		so compares the ASCII vales of the string, result will be not same*/
		System.out.println("Case 2 : Using equals ");
		if (str1.equals(str2)) {
			System.out.println("Both are Same ");
		} else {
			System.out.println("Both are not Same ");
			System.out.println("");
		}
		
		/*Compares the content of the string and ignore case-sensitive.
		so result will be same*/
		System.out.println("Case 3 : Using equalsIgnoreCase ");
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Both are Same ");
		} else {
			System.out.println("Both are not Same ");
			System.out.println("");
		}

	}

}
