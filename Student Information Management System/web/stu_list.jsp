<%--
  Created by IntelliJ IDEA.
  User: Yuqing
  Date: 3/5/2019
  Time: 4:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>Students List Page</title>
    </head>
    <body>
        <br>Students List<br>

        <table border="1" width="700">
            <tr align="center">
                <td>number</td>
                <td>name</td>
                <td>age</td>
                <td>gender</td>
                <td>address</td>
                <td>operation</td>
            </tr>

            <c:forEach items="${sessionScope.students}" var="student">
                <tr align="center">
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.age}</td>
                    <td>${student.gender}</td>
                    <td>${student.address}</td>
                    <td><a href="#">update</a> <a href="#">delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
