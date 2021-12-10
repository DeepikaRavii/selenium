package week1.day1.assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 152;
		int i, a, b = 0;
		i = num;
		while (i > 0) {
			a = i % 10;

			b = b + (a * a * a);

			i = i / 10;
		}
		if (b == num) {
			System.out.println("The Given number " + num + " is Armstrong");
		} else {
			System.out.println("The Given number " + num + " is not Armstrong");
		}
	}

}
