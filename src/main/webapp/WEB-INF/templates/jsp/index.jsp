<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %><%@
taglib prefix="sf" uri="http://www.springframework.org/tags/form" %><%@
taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%@
page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%><!DOCTYPE html>

<html>

  <head>
    <title>Thymeleaf Sandbox: Spring + JSP</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  </head>

  <body>

    <h1>Spring + JSP</h1>
    <h2>Thymeleaf Sandbox application</h2>

    <ul>
        <li>JSP
            <ul>
                <li><a href="<s:url value="/jsp/form"/>">Form</a></li>
                <li><a href="<s:url value="/jsp/exp"/>">Expressions</a></li>
                <li><a href="<s:url value="/jsp/iterconversion"/>">Iteration Conversion</a></li>
            </ul>
        </li>
        <li>Thymeleaf
            <ul>
                <li><a href="<s:url value="/thymeleaf/form"/>">Form</a></li>
                <li><a href="<s:url value="/thymeleaf/exp"/>">Expression</a></li>
                <li><a href="<s:url value="/thymeleaf/iterconversion"/>">Iteration Conversion</a></li>
            </ul>
        </li>
    </ul>

  </body>
  
</html>