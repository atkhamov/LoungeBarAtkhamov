<%--
  Created by IntelliJ IDEA.
  User: Atkhamov
  Date: 7/14/2019
  Time: 12:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LB | Data about client</title>
    <style>
        table{
            font-family: Arial, SansSerif;
            border-collapse: collapse;
            width: 100%;
        }
        td, th{
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        tr:nth-child(even){
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>ClientID</th>
        <th>Name</th>
        <th>PhoneNum</th>
        <th>Address</th>
        <th>DateOfBirth</th>
        <th>Discount</th>
        <th>LastOrderSum</th>
        <th>FavoriteFood</th>
        <th>FavoriteDrink</th>
    </tr>
    <tr>
        <td>${client.id}</td>
        <td>${client.name}</td>
        <td>${client.phone}</td>
        <td>${client.address}</td>
        <td>${client.dateOfBirth}</td>
        <td>${client.discountRate}</td>
        <td>${client.lastOrderSum}</td>
        <td>${client.favFood}</td>
        <td>${client.favDrink}</td>
    </tr>
</table>

</body>
</html>
