package week1.day2;

public class MyKids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMobile mobile = new MyMobile();
		
		mobile.brandName = 'S';
		mobile.cost = 30000;
		
		System.out.println("BrandName : " +mobile.brandName);
		System.out.println("Cost : "+mobile.cost);
		
		mobile.makeCalls();
		mobile.viewGallery();
		//mobile.payBills();

	}

}
