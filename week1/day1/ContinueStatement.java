package week1.day1;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue; // skip
			}
			System.out.println(i);
		}
		
		System.out.println(" Out of for loop");

	}

}
