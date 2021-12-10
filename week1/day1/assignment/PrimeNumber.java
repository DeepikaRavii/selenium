package week1.day1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		int num =13;
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag!=true) {
			System.out.println("The given number "+num+" is Prime Number");
		} else {
			System.out.println("The given number "+num+" is not Prime Number");

		}
	}

}
