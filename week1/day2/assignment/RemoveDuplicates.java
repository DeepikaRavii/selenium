package week1.day2.assignment;



public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0, i;
		String replaceString="";
		
		String[] split = text.split(" ");
		
		System.out.println("without duplicate words : " );
		
		for ( i = 0; i < split.length-1; i++) {
			
				for (int j = i+1; j < split.length-1; j++) {
					
					if (split[i].equals(split[j])) {
						replaceString = split[j];
						count++;
						
						} 
				}
				
		}
		  if(count>0)
	            
          {
              System.out.println(text.replace(replaceString,  ""));
      }
      
					

	
	                                                                                                                                                                          
	}

}
