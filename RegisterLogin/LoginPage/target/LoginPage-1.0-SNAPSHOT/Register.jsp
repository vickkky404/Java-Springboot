<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
    <form action="regForm" method="post">
        Name: <input type="text" name="name1"> <br> <br>
        Email: <input type="text" name="email1"> <br> <br>
        Password: <input type="password" name="pass1"> <br> <br>
        Gender: <input type="radio" name="gender1" > Male <input type="radio" name="gender1" >
        City: <select>
                <option>Select City</option>
                <option>Delhi</option>
                <option> Mumbai</option>
                <option>Bhubaneswar</option>
            </select> <br> <br>
    <input type="submit" value="Register">
    </form>
</body>
</html>