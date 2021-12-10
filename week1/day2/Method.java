package week1.day2;

public class Method {
	
	public int add() {
		int a = 10;
		int b = 20;
		int c;
		c = a + b;
		return c;

	}
	
	public void getResult(String str, int age) {
		System.out.println("Name : " +str);
		System.out.println("Age : " +age);
	}

	public static void main(String[] args) {
		Method obj = new Method();
		
		obj.getResult("Anu", 18);
		
		int total = obj.add();
		System.out.println("Total Mark : " +total);
	}
}