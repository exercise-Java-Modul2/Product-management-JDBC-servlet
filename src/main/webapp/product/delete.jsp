<%--
  Created by IntelliJ IDEA.
  User: syphan
  Date: 8/10/2018
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete product</title>
</head>
<body>
<h1>Delete product from list</h1>
<p>Are you sure?</p>
<form method="post">
    <fieldset>
        <legend>Delete product</legend>
        <p>
            <a href="/products">Back to product list</a>
        </p>
        <table>
            <tr>
                <td>Name:</td>
                <td>${requestScope["product"].getName()}</td>
            </tr>
            <tr>
                <td>Price:</td>
                <td>${requestScope["product"].getPrice()}</td>
            </tr>
            <tr>
                <td>Category_id:</td>
                <td>${requestScope["product"].getCategory_id()}</td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Delete"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
