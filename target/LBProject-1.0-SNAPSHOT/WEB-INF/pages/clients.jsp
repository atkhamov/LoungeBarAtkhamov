<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%--
  Created by IntelliJ IDEA.
  User: Atkhamov
  Date: 7/14/2019
  Time: 12:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
    <a href="../../index.jsp">Go to main page</a>
    <h1>List of Clients</h1>
    <c:if test="${!empty listClients}">
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
                <th>Operation</th>
            </tr>
            <c:forEach items="${listClients}" var="client">
                <tr>
                    <td>${client.id}</td>
                    <td><a href="/clientdata/${client.id}" target="_blank"> ${client.name}</a></td>
                    <td>${client.phone}</td>
                    <td>${client.address}</td>
                    <td>${client.dateOfBirth}</td>
                    <td>${client.discountRate}</td>
                    <td>${client.lastOrderSum}</td>
                    <td>${client.favFood}</td>
                    <td>${client.favDrink}</td>
                    <td><a href="c:url value='/edit/${client.id}'>">Edit</a> </td>
                    <td><a href="c:url value='/remove/${client.id}'>">Delete</a> </td>
                </tr>
            </c:forEach>

        </table>
    </c:if>
    <h1>Add new client</h1>
    <c:url var="addAction" value="/clients/add"/>
    <form:form action="${addAction}" modelAttribute="client">
            <table>
                <c:if test="${!empty client.name}">
                    <tr>
                        <td>
                            <form:label path="id">
                                <spring:message text="ClientID"/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="id" readonly="true" size="8" disabled="true"/>
                        </td>
                    </tr>
                </c:if>
                <tr>
                    <td>
                        <form:label path="name">
                            <spring:message text="Name"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="name"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="phone">
                            <spring:message text="Phone"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="phone"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="address">
                            <spring:message text="Address"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="address"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="dateOfBirth">
                            <spring:message text="DateOfBirth"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="dateOfBirth"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="discountRate">
                            <spring:message text="DiscountRate"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="discountRate"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="lastOrderSum">
                            <spring:message text="LastOrderSum"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="lastOrderSum"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="favFood">
                            <spring:message text="FavFood"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="favFood"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="favDrink">
                            <spring:message text="FavDrink"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="favDrink"/>
                    </td>
                </tr>

                <tr>
                    <td colspan="2">
                        <c:if test="${!empty client.name}">
                            <input type="submit" value="<spring:message text="Edit Client"/>"/>
                        </c:if>
                        <c:if test="${empty client.name}">
                            <input type="submit" value="<spring:message text="Add New Client"/>"/>
                        </c:if>
                    </td>
                </tr>
            </table>
    </form:form>
</body>
</html>
