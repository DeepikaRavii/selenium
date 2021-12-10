package week1.day2.assignment;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		
		int add = myCal.add(10, 20, 30);
        System.out.println("Addition of the Numbers : "+add);
        
        int sub = myCal.subraction(40, 20);
        System.out.println("Subtraction of the Numbers : "+sub);
        
        double mul = myCal.mulitipliy(4.5,8.2);
        System.out.println("Multiplication of the Numbers : "+mul);
        
        float div = myCal.divide(13.30f, 2.5f);
        System.out.println("Division of the Numbers : "+div);
	}

}
