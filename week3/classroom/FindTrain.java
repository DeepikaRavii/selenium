package week3.classroom;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTrain {
	public static void main(String[] args) {
	//	List<String> trainNames1 = new ArrayList<String>();
		List<String> trainNames =Arrays.asList("Mysore Express","Chennai Express","Mumbai Express","Goa Express","Kolkata Express");
		
		Collections.sort(trainNames);	
		System.out.println(trainNames);
	}
}

