package week1.day2;

public class MyMobile {

	// variables/State
	// Instance variables
	// Can be accessed all through the classes globally using the objects(instance)

	// Local variable:
	// Restricted to that method alone
	String objCategory = "MobilePhone"; // declaration; initilization
	String shape;
	char brandName;
	int cost;

	// Methods/Behaviour
	// Syntax/ Signature
	// Access Modifier/Specifier returnType methodName ()-arguments { method body}
	// Access Modifer:
	// Public:
	// Private:
	// Protected: Inheritence
	// default/package:

	public void makeCalls() {
		int value = 23;
		System.out.println("Method is used for calling purpose");
		System.out.println("Value is : " + value);
	}

	public void viewGallery() {
		int value = 23;
		System.out.println("Method is used for Viewing Gallery");
		System.out.println("Value is : " + value);
	}

	private void payBills() {
		System.out.println("Method is used for Billing purpose");
	}

	// To make use of the memebers of class
	// Step 1: main() method
	// Step 2: Create an object/ Instantiating
	// Memory is allocated only when an object is created
	// Memory allocation is not done when a class is created
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile samsung = new MyMobile();
		samsung.brandName = 'S';
		samsung.cost = 30000;
		
		samsung.makeCalls();
		samsung.viewGallery();
		samsung.payBills();
		
		System.out.println(" samsung Brand:" + samsung.brandName);
		System.out.println(" samsung Cost:" + samsung.cost);
		

	}

}
