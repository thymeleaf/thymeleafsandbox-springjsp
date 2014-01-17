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

    <h2>JSP-based Spring expressions</h2>

    <p><s:eval expression="aMap['aKey']" /></p>
    <p><s:eval expression="aMap.aKey" /></p>

  
  </body>
  
</html>