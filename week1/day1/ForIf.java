package week1.day1;

public class ForIf {
	// print even numbers from 0 to 50
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even Number");
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}
		}
			// Printing Even numbers using "Continue Statement"
			System.out.println("Printing Even Numbers Using Continue Statement");
			for (int j = 0; j <= 50; j++) {
				if (j % 2 != 0) {
					continue;
				}
				System.out.println(j);
			

		}
	}

}
