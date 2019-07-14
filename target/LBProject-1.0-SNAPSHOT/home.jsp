<%--
  Created by IntelliJ IDEA.
  User: Atkhamov
  Date: 7/7/2019
  Time: 5:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>LB | Home</title>
<%--    <style>--%>
<%--        table{--%>
<%--            font-family: Arial, SansSerif;--%>
<%--            border-collapse: collapse;--%>
<%--            width: 100%;--%>
<%--        }--%>
<%--        td, th{--%>
<%--            border: 1px solid #dddddd;--%>
<%--            text-align: left;--%>
<%--            padding: 8px;--%>
<%--        }--%>
<%--        tr:nth-child(even){--%>
<%--            background-color: #dddddd;--%>
<%--        }--%>
<%--    </style>--%>
</head>

<body>

<a href="<c:url value="/clients"/>" target="_blank">List of Clients</a>

<%--<c:if test="${!empty clientList}">--%>
<%--    <table>--%>
<%--        <tr>--%>

<%--            <th>Name</th>--%>
<%--            <th>PhoneNum</th>--%>
<%--            <th>Address</th>--%>
<%--            <th>DateOfBirth</th>--%>
<%--            <th>Discount</th>--%>
<%--            <th>LastOrderSum</th>--%>
<%--            <th>FavoriteFood</th>--%>
<%--            <th>FavoriteDrink</th>--%>
<%--            <th>Operation</th>--%>
<%--        </tr>--%>

<%--        <c:forEach var="home" items="${clientList}">--%>
<%--            <tr>--%>

<%--                <td>${home.name}</td>--%>
<%--                <td>${home.phone}</td>--%>
<%--                <td>${home.address}</td>--%>
<%--                <td>${home.dateOfBirth}</td>--%>
<%--                <td>${home.discountRate}</td>--%>
<%--                <td>${home.lastOrderSum}</td>--%>
<%--                <td>${home.favFood}</td>--%>
<%--                <td>${home.favDrink}</td>--%>
<%--                <td><a href="/LBProject_war_exploded/delete/${home.id}">Delete</a> </td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>
<%--</c:if>--%>

</body>
</html>
