package week3.assignment;

public class Desktop implements HardWare, Software{
	
	public void softwareResources() {
		System.out.println("Software");
	}

	public void hardwareResources() {
		System.out.println("Hardware");
	}
	
	public void desktopModel() {
		System.out.println("DesktopModel");
	}

	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		desktop.softwareResources();
		desktop.hardwareResources();
		desktop.desktopModel();
	}



}
