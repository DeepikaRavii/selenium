package week1.day2.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,7,6,};
		Arrays.sort(arr);
		System.out.println("Sorted Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Missing Elements : ");
		for (int i = 1; i < arr.length; i++) {
											
			if (i!= arr[i-1]) {
				System.out.println(i);
				break;
			
			}
			}
		}

	}


