package week1.day1.assignment;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=-40;
int pnum;
if(num<0)
{
	pnum=num+(num*-2);
	System.out.println("The Negative Number "+num +" is converted into Positive Number as "+pnum);
} else {
	System.out.println("Given Number "+num +" is Positive");
}
	}

}
