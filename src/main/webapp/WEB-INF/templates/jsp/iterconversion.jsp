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

    <h1>Testing the iteration + conversion combination in Spring MVC</h1>

    <ul>
        <c:forEach var="d" items="${dates}">
          <li><s:eval expression="d.dateOne" /> - <s:eval expression="d.dateTwo" /></li>
        </c:forEach>
    </ul>

  </body>
  
</html>