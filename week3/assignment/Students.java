package week3.assignment;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student ID : "+ id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID : "+id);
		System.out.println("Student Name : "+name);
	}
	public void getStudentInfo(String email , long phoneNumber) {
		System.out.println("Student Email : "+email);
		System.out.println("Student phoneNumber : "+phoneNumber);
	}
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(013);
		s.getStudentInfo(013, "Anu");
		s.getStudentInfo("anu@gmail.com", 9864520371L);
	}

}
