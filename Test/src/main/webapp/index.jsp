<form action="your-action-url" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    <br><br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>
    <br><br>

    <label for="phone">Phone Number:</label>
    <input type="tel" id="phone" name="phone" required>
    <br><br>


    <form action="LoginServlet" method="post">
        Username: <input type="text" name="username"><br>
        Password: <input type="password" name="password"><br>
        <input type="submit" value="Login">
    </form>



    <button type="submit">Submit</button>
</form>
