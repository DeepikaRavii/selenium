package week3.classroom;



public class Calculator {

	public void add(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println("Sum of three nos: " + sum);
	}

	public void add(int x, int y) {
		int sum = x + y;
		System.out.println("Sum of two nos: " + sum);
	}

	public void sub(int x, int y) {
		int sub = x - y;
		System.out.println("Subraction of three nos: " + sub);
	}

	public void sub(double x, double y) {
		double sub = x - y;
		System.out.println("Subraction of two nos: " + sub);
	}

	public void mul(int x, int y) {
		int mul = x * y;
		System.out.println("Multiplication of three nos: " + mul);
	}

	public void mul(double x, double y) {
		double mul = x * y;
		System.out.println("Multiplication of two nos: " + mul);
	}
	public void div(int x, int y) {
		int div = x/y;
		System.out.println("Division of three nos: " + div);
	}

	public void div(double x, double y) {
		double div = x / y;
		System.out.println("Division of two nos: " + div);
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(11,12,13);
		c.add(20, 5);
		c.sub(10, 6);
		c.sub(11.1, 1.1);
		c.mul(5, 5);
		c.mul(3.2, 1.2);
		c.div(36, 9);
		c.div(12.34, 2.2);
	}

}
