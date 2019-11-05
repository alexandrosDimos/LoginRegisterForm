<%-- 
    Document   : index
    Created on : 31 Οκτ 2019, 1:56:25 μμ
    Author     : arc68
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="styles.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form class="login_text" action = "loginRegister" method="POST">
            <p>Login to your<br> account</p>
            <table>
                <tr>
                    <td><h3>${message}</h3>
                        <h3>${successMessage}</h3></td>
                    <td></td>
                </tr>
                <tr>
                    <td><input type="text" name="Username" placeholder="Username" class="inputs_text"></td>
                </tr>
                <tr>
                    <td><input type="password" name="Password" placeholder="Password" class="inputs_text"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="Submit" value="Login" class="inputs_text"></td>
                </tr>
                <tr>
                    <td><a href="register.jsp" class="inputs_text">Register</a> </td>
                </tr>
            </table>
        </form>
    </body>
</html>
