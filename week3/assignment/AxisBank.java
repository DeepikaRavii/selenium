package week3.assignment;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		//super.deposit();
		System.out.println("AXIS Bank Deposit Account");
	}

	public static void main(String[] args) {

		AxisBank a = new AxisBank();
		a.saving();
		a.fixed();
		a.deposit();
		
	
	}

}
