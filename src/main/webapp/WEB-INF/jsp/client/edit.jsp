<%-- 
    Document   : edit
    Created on : Dec 28, 2015
    Author     : Trey Seals - Inspired by: FMilens
--%>

<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<%@taglib prefix='fn' uri='http://java.sun.com/jsp/jstl/functions'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Client</title>
    </head>
    <body>
        <h1>Edit Client</h1>
        <c:if test="${fn:length(errors) gt 0}">
            <p>Please correct the following errors in your submission:</p>
            <ul>
                <c:forEach items="${errors}" var="error">
                    <li>${error}</li>
                </c:forEach>
            </ul>
        </c:if>
        <form action="${pageContext.request.contextPath}/client/edit" method="POST">
         <input type="hidden" name="clientId" value="${client.clientId}"/>
            <br/>
            <label for="name">Name:</label>
            <input type="text" name="name" value="${client.name}"/>
            <br/>
            <label for="streetAddress">Street Address:</label>
            <input type="text" name="streetAddress" value="${client.streetAddress}"/>
            <br/>
            <label for="city">City:</label>
            <input type="text" name="city" value="${client.city}"/>
            <br/>
            <label for="state">State:</label>
            <input type="text" name="state" value="${client.state}"/>
            <br/>
            <label for="zipCode">Zip Code:</label>
            <input type="text" name="zipCode" value="${client.zipCode}"/>
            <br/>
             <label for="zipCode">Phone Number:</label>
            <input type="text" name="phoneNumber" value="${client.phoneNumber}"/>
            <br/>
            <label for="uri">URI:</label>
            <input type="text" name="uri" value="${client.uri}"/>
            <br/>
            <input type="submit" name="Submit" value="Submit"/>
        </form>
        <br>
        <h1>People:</h1>
        <c:forEach items="${people}" var="person">
                    <li>${person.firstName}  ${person.lastName}</li>
                </c:forEach>
                
        <h2>Add a new Person</h2>
      
      <form action="${pageContext.request.contextPath}/client/addPerson/${client.clientId}"  method="POST">
      <select name="personToAdd">
      	<c:forEach items="${possiblePeople}" var="possiblePerson">
              <option value= "${possiblePerson.personId}">${possiblePerson.firstName} ${possiblePerson.lastName}</option>
        </c:forEach>
      </select>
      <br/>
      <input type="submit" name="Submit" value="Submit"/>
      </form>
      
        
    </body>
</html>