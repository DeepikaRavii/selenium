package week1.day2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// Array Initialisation
		int[] numArr = { 12, 221, 10, 133, 14, 105, 16 };

		// size of the array/ number of elements
		// length - property

		int len = numArr.length;
		System.out.println("The Length of the Array is : " + len);

		// how to access the element using an array - Index
		System.out.println("The third element of the Array :" + numArr[2]);

		// how to access last element
		System.out.println("The last element of the Array : " + numArr[len - 1]);
		System.out.println("The second last element of the Array : " + numArr[len - 2]);

		// how to access first element
		System.out.println("The first element of the Array : " + numArr[0]);

		// to print all the elemnts of an array
		System.out.println("The elements in the Array :");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);

			// System.out.println(numArr[length]);
			// numArr[length] = numArr[7]
			// ArrayIndexOutOfBoundsException

			// sorting
			Arrays.sort(numArr);
			System.out.println("Sorted Array:");
			for (int j = 0; j < numArr.length; j++) {
				System.out.println(numArr[j]);
			}

		}

	}

}
