import java.sql.*;
public class DemoJDBC {
    public static void main(String[] args) throws Exception  {

        /**
         * import packaga
         * load and register
         * create conn
         * create statement
         * process the result\
         * execute statement
         * process the result
         * close
         */

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "0000";
        String Query = "Select sid from student where sid = 1";

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("connection established");


        Statement s1 = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        System.out.println(rs.next());

        con.close();

    }
}
