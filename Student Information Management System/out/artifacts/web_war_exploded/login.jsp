<%--
  Created by IntelliJ IDEA.
  User: Yuqing
  Date: 3/5/2019
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login Page</title>
    </head>
    <body>
        <h2>Welcome to Laurentian SIM System</h2>

        <form action="LoginServlet" method="post">
            username: <input type="text" name="username"/><br>
            password: <input type="password" name="password"/><br>
            <input type="submit" value="Administrator Login">
        </form>

    </body>
</html>
