package in.sp.beans;

public class Student 
{
	
	private String name;
	private int rollno;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void displayInfo() {
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll No: "+rollno);
		System.out.println("Student Email: "+email);
	}
}
