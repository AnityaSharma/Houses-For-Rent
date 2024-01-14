<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core
"
         prefix="c" %>
<%@ taglib uri="/functions" prefix="f" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="login-container">
        <h2>Login</h2>
        <div class="form-group">
            <input type="email" id="email" placeholder="Enter your email">
        </div>

        <div class="form-group">
            <input type="password" id="password" placeholder="Enter your password">
        </div>

        <div>
            <button class="submitButton" onclick="submitForm()">Submit</button>
        </div>
        <div class="loginLink">
            <a href="">Signup</a>
        </div>

    </div>

</body>
</html>