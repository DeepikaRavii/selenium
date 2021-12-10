package week1.day2.assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 11, 4, 6, 7 };
		int[] arr1 = { 1, 2, 8, 4, 9, 7 };
		
        System.out.println("Intersection of the array : "); 
        
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i]==arr1[j]) {
					System.out.println(arr[i]);
				}
			}
			
		}
	}

}
