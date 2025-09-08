package jdbc.dao;

//import com.mysql.cj.jdbc.Driver;

import jdbc.model.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	public Student getStudentById(int reg) throws SQLException {
		Student stud  = null; //??
		
		Connection con = null;
		Statement st = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB", "root", "1425360");
			st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM users where reg=" + reg);
			if(rs.next()) {
				stud = new Student();
				stud.setReg(reg);
				stud.setName(rs.getString("name"));
				stud.setEmail(rs.getString("email"));
				stud.setPanNo(rs.getLong("pan_no"));

			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return stud;
	}
}
