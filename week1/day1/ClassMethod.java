package week1.day1;

public class ClassMethod {

	// variables/State
	String objectCategory = " Mobile Phone";
	float size; // declaration; initilization
	String shape;
	String IMEI;
	char brandName;
	int resolution;
	byte weight;
	boolean isTouchScreen;
	short costMobile;

	// Methods/Behaviour
	public void makeCalls() {
		System.out.println("Making Calls");

	}

	public void viewGallery() {

		System.out.println("Viewing Gallery");
	}

	private void payBills() {

		System.out.println("Paying Bills");
	}

	// To make use of the memebers of class
	// Step 1: main() method
	// Step 2: Create an object/ Instantiating
	// Memory is allocated only when an object is created
	// Menory allocation is not done when a class is created

	public static void main(String[] args) {

		// <className> <objectname> =new className();
		// Members of a class can be accesses only through objects
		ClassMethod Samsung = new ClassMethod();
		Samsung.brandName = 'S';
		Samsung.costMobile = 30000;
		Samsung.isTouchScreen = true;
		Samsung.makeCalls();
		Samsung.viewGallery();
		Samsung.payBills();
		System.out.println("Brand Name:" + Samsung.brandName);
		System.out.println("Price:" + Samsung.costMobile);
		System.out.println("Is it TouchScreen:" + Samsung.isTouchScreen);
		System.out.println("");

		ClassMethod Apple = new ClassMethod();
		Apple.brandName = 'A';
		Apple.costMobile = 32000;
		Apple.isTouchScreen = true;
		Apple.makeCalls();
		Apple.viewGallery();
		Apple.payBills();

		System.out.println("Brand Name:" + Apple.brandName);
		System.out.println("Price:" + Apple.costMobile);
		System.out.println("Is it TouchScreen:" + Apple.isTouchScreen);

	}

}
