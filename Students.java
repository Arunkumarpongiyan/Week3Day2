package Week3Day2;

//OverLoading

public class Students {
	public void getStudentInfo(int ID) {
		
		System.out.println("Student ID:" + " " + ID);
		
	}
	
	public void getStudentInfo(int ID, String Name) {
		
		System.out.println("Student ID" + " "  + ID + ", " + "Student Name:" + " " + Name);
		
	}
	
	public void getStudentInfo(String email, double phonenumber) {
		
		System.out.println("Student Email: " + " " + email + ", " + "Student Phone number: " + phonenumber);
		
	}

	public static void main(String[] args) {
		
		Students obj=new Students();
		obj.getStudentInfo(10);
		obj.getStudentInfo(10, "Arun");
		obj.getStudentInfo("arunkumarpongiyan@gmail.com", 9994181334L);
		

	}

}
