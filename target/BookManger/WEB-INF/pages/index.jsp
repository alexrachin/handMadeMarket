<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Proselyte</title>
</head>
<body>
<h3>Proselyte presents</h3>
<br/>
<%--<p>Product count: ${productCount}</p>--%>
<p>Product name: ${product.name}</p>
<p>Product description: ${product.description}</p>
<p>Product price: ${product.price}</p>
<br/>
<br/>
<c:url var="addAction" value="/product/add"/>
<br/>
<form:form action="${addAction}" commandName="product">
                <form:input path="name"/>
                <form:input path="description"/>
                <form:input path="price"/>
                <form:input path="iconUrl"/>
                <input type="submit" value="Add product"/>
</form:form>
</body>
</html>