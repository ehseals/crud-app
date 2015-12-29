<%-- 
    Document   : list
    Created on : 12 28, 2015
    Author     : TSeals , based off of work of FMilens 
--%>

<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@taglib prefix='fn' uri='http://java.sun.com/jsp/jstl/functions'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Person Listing</title>
    </head>
    <body>
        <h1>Client Listing</h1>     
        <p><a href="${pageContext.request.contextPath}/client/create">Create New Client</a></p>
        <c:choose>
            <c:when test="${fn:length(clients) gt 0}">
                <table>
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Address</th>
                            <th>URI</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${clients}" var="client">
                            <tr>
                                <td>${client.name}</td>
                                <td>${client.streetAddress} ${client.city}  </td>
                                <td>${client.uri}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/client/edit/${client.clientId}">Edit Client</a>
                                    <a href="${pageContext.request.contextPath}/client/delete/${client.clientId}">Delete Client</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:when>
            <c:otherwise>
                <p>No results found.</p>
            </c:otherwise>
        </c:choose>
    </body>
</html>
