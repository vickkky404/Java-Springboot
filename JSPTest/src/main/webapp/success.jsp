<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Success</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
  <div class="card mx-auto text-center" style="max-width: 500px;">
    <div class="card-header bg-success text-white">
      <h2>Registration Successful!</h2>
    </div>
    <div class="card-body">
      <p class="lead">Thank you for registering, <%= request.getParameter("username") %>!</p>
      <a href="index.jsp" class="btn btn-success">Return Home</a>
    </div>
  </div>
</div>
</body>
</html>