<%@ page import="javax.servlet.http.*" %>
<%

    HttpSession session = request.getSession();


    session.setAttribute("username", "Nalinikant");

    out.println("Session ID: " + session.getId());
    out.println("<br>Username stored in session.");
%>
