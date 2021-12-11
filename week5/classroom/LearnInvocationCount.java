package week5.classroom;

import org.testng.annotations.Test;

public class LearnInvocationCount {
	
	@Test(invocationCount=5)
	public void createLead() {
		System.out.println("Create Lead");

	}

}
