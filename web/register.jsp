<%-- 
    Document   : register
    Created on : 31 Οκτ 2019, 2:28:50 μμ
    Author     : arc68
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="styles.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form class="register_text" action ="loginRegister" method ="POST">
            <p>Register</p>
            <table>
                <tr>
                    <td><input type="text" name="Username" placeholder="Username" class="inputs_text"></td>
                </tr>
                <tr>
                    <td><input type="email" name="Email" placeholder="Email" class="inputs_text"></td>
                </tr>
                <tr>
                    <td><input type="password" name="Password" placeholder="Password" class="inputs_text"></td>
                </tr>
                <tr>
                    <td><input type="password" name="ComfirmPassword" placeholder="Confirm Password" class="inputs_text"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="Submit" value="Register" class="inputs_text"></td>
                </tr>
                <tr>
                    <td><a href="index.jsp" class="inputs_text">Go to Login Page</a> </td>
                </tr>
            </table>
        </form>
    </body>
</html>
