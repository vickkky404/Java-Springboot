package jdbc.model;

public class Student {
	private int reg;
	private String name;
	private String email;
	private long panNo;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int reg, String name, String email, long panNo) {
		super();
		this.reg = reg;
		this.name = name;
		this.email = email;
		this.panNo = panNo;
	}
	
	
	


	public int getReg() {
		return reg;
	}
	public void setReg(int reg) {
		this.reg = reg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPanNo() {
		return panNo;
	}
	public void setPanNo(long panNo) {
		this.panNo = panNo;
	}
	
	
	@Override
	public String toString() {
		return "Student [reg=" + reg + ", name=" + name + ", email=" + email + ", panNo=" + panNo + "]";
	}
	
	
}
