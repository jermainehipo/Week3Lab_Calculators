<%-- 
    Document   : agecalculator
    Created on : 24-Sep-2022, 3:04:59 PM
    Author     : jerma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="agecalculator">
            Enter your age:<input type="text" name="age"><br>
            <input type="submit" value="Age next birthday">
            <p>f${result}</p><br>
        </form>
    </body>
</html>