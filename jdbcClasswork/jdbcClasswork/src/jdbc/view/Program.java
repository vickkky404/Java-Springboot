package jdbc.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.dao.StudentDao;
import jdbc.model.Student;


public class Program(StudentDao()) throws Exception{

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		int flag = 0;
		Connection con = null;
		PreparedStatement st = null;
		try{
			con = st.getConnection();
			st = con.prepareStatement("INSERT INTO student(regd_no , name , email , pan_no) VALUES(?,?,?,?) ");
			st.setInt(1 , stud,getRegdNo());
			st.setString(2 , stud.getName());
			st.getString(3 , dtud.getEmail());
			st.setLong(4 , stud.getPanNo());

		}
	}

}
