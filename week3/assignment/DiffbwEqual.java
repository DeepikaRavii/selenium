package week3.assignment;

public class DiffbwEqual {

	public static void main(String[] args) {

		 String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 /* == operators used for reference comparison, 
		  * it checks the memory address of the both String
		  * "new" keyword creates the new memory position for str4,
		  * so while comparing str3 and str4 result will be different */
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("***");

	}

}
