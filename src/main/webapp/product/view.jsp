<%--
  Created by IntelliJ IDEA.
  User: syphan
  Date: 8/9/2018
  Time: 9:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show detail information product</title>
</head>
<body>
<h1>Show detail information Product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table border="1" style="text-align: center">
    <tr>
        <td>Id:</td>
        <td>${requestScope["product"].getId()}</td>
    </tr>
    <tr>
        <td>Name:</td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Price:</td>
        <td>${requestScope["product"].getPrice()}</td>
    </tr>
    <tr>
        <td>Category_id</td>
        <td>${requestScope["product"].getCategory_id()}</td>
    </tr>
</table>
</body>
</html>
