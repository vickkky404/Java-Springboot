package com.cutm.jsptest;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");


        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);


        response.sendRedirect("success.jsp");
    }
}