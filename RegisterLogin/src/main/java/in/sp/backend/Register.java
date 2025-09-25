//package in.sp.backend;
//
//import java.io.*;
//import jakarta.servlet.http.*;
//import jakarta.servlet.annotation.*;
//
//@WebServlet(name = "helloServlet", value = "/hello-servlet")
//public class Register extends HttpServlet {
//    private String message;
//
//    public void init() {
//        message = "Hello World!";
//    }
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }
//
//    public void destroy() {
//    }
//}



package in.sp.backend;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static java.lang.System.out;

@WebServlet("/regForm")
public class Register extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        super.doPost(req, resp);
        String myname = req.getParameter("name1");
        String myemail = req.getParameter("email1");
        String mypassword  = req.getParameter("password");
        String mygender  = req.getParameter("gender1");
        String mycity  = req.getParameter("city1");


        try{
            //loading the DB driver...
            Class.forName("com.mysql.jdbc.Driver");
            //connection checking.....
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/workspaces\"root\",\"@Jnq9pmx85s\"/yt_demo");

            PreparedStatement ps = con.prepareStatement("insert into register values (?,?,?,?,?)");

            ps.setString(1, myname);
            ps.setString(2, myemail);
            ps.setString(3, mypassword);
            ps.setString(4, mygender);
            ps.setString(5, mycity);


            //checking
            int count =  ps.executeUpdate();
            if(count > 0){
                resp.setContentType("text/html");
                out.print("<h3> style='color:green' User registered Successfully </h3> ");

                RequestDispatcher rd =  req.getRequestDispatcher("/register.jsp");
                rd.include(req,resp);
            }else {
                resp.setContentType("text/html");
                out.print("<h3> style='color:red' User not registered due to some problem </h3> ");

                RequestDispatcher rd =  req.getRequestDispatcher("/register.jsp");
                rd.include(req,resp);

            }



        }

        catch(Exception e){
            e.printStackTrace();

            resp.setContentType("text/html");
            out.print("<h3> style='color:red' > Exception Occured:  " +e.getMessage()+ "</h3> ");
            RequestDispatcher rd =  req.getRequestDispatcher("/register.jsp");
            rd.include(req,resp);
        }
    }
}