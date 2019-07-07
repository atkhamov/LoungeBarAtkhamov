<%--
  Created by IntelliJ IDEA.
  User: Atkhamov
  Date: 7/7/2019
  Time: 7:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>LB | Add New Client</title>
    <style>
        label {
            color: #B4886B;
            font-weight: bold;
            display: block;
            width: 150px;
        }
        label:after { content: ":" }
    </style>
</head>
<body>
<form action="/add-new-client" method="POST">
    <label>Name</label>
    <input type="text" name="name">

    <label>Phone</label>
    <input type="text" name="phone">

    <label>Address</label>
    <input type="text" name="address">

    <label>Date of Birth</label>
    <input type="text" name="dateOfBirth">

    <label>Discount Rate</label>
    <input type="text" name="discountRate">

    <label>Last Order Sum</label>
    <input type="text" name="lastOrderSum">

    <label>Favorite Food</label>
    <input type="text" name="favFood">

    <label>Favorite Drink</label>
    <input type="text" name="favDrink">

    <a href="/LBProject_war_exploded/">ADD NEW CLIENT</a>
</form>

</body>
</html>
