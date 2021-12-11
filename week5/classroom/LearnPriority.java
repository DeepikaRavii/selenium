package week5.classroom;

import org.testng.annotations.Test;

public class LearnPriority {

	@Test(priority=-1)
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	@Test(priority=2)
	public void editLead() {
		System.out.println("Edit Lead");
	}

	@Test
	public void deleteLead() {
		System.out.println("Delete Lead");
	}


}
