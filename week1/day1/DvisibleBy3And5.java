package week1.day1;

public class DvisibleBy3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=35;
        if (num%3==0 && num%5==0)
        {
			System.out.println("TRIZZ - FIZZ");
		} 
        else if(num%5==0)
        {
       	 System.out.println("FIZZ");
      
        }
        else if(num%3==0 )
        {
       	 System.out.println("TRIZZ");
      
        }
        else
        {
       	 System.out.println("Not Divisible by both 3 and 5");
        }
	}

}
