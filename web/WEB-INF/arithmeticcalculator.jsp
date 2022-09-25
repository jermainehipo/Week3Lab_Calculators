<%-- 
    Document   : arithmeticcalculator
    Created on : 24-Sep-2022, 3:30:59 PM
    Author     : jerma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmeticcalculator">
            First: <input type="text" name="firstnum" value="${firstnum}"><br>
            Second: <input type="text" name="secondnum" value="${secondnum}"><br>
            <input type="submit" name="submit" value="+">
            <input type="submit" name="submit" value="-">
            <input type="submit" name="submit" value="*">
            <input type="submit" name="submit" value="%">
            <br><br>
            Result: ${result} <br>
            
            <a href="agecalculator">Age Calculator
            
        </form>
    </body>
</html>
