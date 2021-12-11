package week3.classroom;

public class Execution {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.accelerate();
		b.applyBrake();
		b.closeDoor();
		b.driveVehicle();
		b.enableAirbag();
		b.fillFuel();
		b.shiftGear();
		System.out.println("The count of the BMW wheel : "+b.carWheel);
		
		Audi a = new Audi();
		a.accelerate();
		a.applyBrake();
		a.closeDoor();
		a.driveVehicle();
		a.enableAirbag();
		a.fillFuel();
		a.shiftGear();
		System.out.println("The count of the Audi wheel : "+a.carWheel);
		
		Bajaj auto = new Bajaj();
		auto.accelerate();
		auto.applyBrake();
		auto.driveVehicle();
		auto.fillFuel();
		auto.shiftGear();
		System.out.println("The count of the Bajaj wheel : "+auto.AutoWheel);
		


	}

}
