package week1.day2;

import java.util.Arrays;

public class SecondLargestAndSecondSmallest {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum= {100,49,398,34,1,267};
		int length= arrNum.length;
		System.out.println("array Length:" +length);
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
		Arrays.sort(arrNum);
		System.out.println("Second Largest:" + arrNum[length-2]);
		
		System.out.println("Second Smallest:"+ arrNum[1]);
		
	}

}
