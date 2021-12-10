package week1.day2.assignment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(data);
		System.out.println("Sorted Array:");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		int len = data.length;
		System.out.println("The Second largest number is : "+data[len-2]);

	}

}
