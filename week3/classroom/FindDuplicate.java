package week3.classroom;


import java.util.LinkedHashSet;
import java.util.Set;


public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10,24,32,64,85,85,37,12};
		boolean bDuplicate = false;
		Set<Integer> unique = new LinkedHashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(unique.add(nums[i])==false) {
			System.out.println("Duplicate value : "+nums[i]);
			bDuplicate = true;
			break;
			}
		}
		if(!bDuplicate) {
		System.out.println(unique);
	}
	}

}
