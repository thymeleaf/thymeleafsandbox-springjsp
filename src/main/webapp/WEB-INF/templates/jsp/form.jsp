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

    <h2>JSP-based Spring form</h2>



    <sf:form modelAttribute="user" action="/jsp/form">

        <p>
            The ID of this user is: <s:eval expression="user.id" />
        </p>
        <p>
            The Registration Date of this user is: <s:eval expression="user.registrationDate" />
        </p>
        <fieldset>
            <div>
                <sf:errors path="*"/>
            </div>
            <div>
                <label for="userid">ID:</label><sf:input id="userid" path="id"/>
            </div>
            <div>
                <s:message code="msg.one" arguments="${user.id}"/>
            </div>
            <div>
                <label for="name">Name:</label><sf:input id="name" path="name"/>
            </div>
            <div>
                <label for="surname">Surname:</label><sf:input id="surname" path="surname"/>
            </div>
            <div>
                <label for="registrationDate">Registration Date:</label><sf:input id="registrationDate" path="registrationDate"/>
            </div>
            <div>
                <sf:button>Send!</sf:button>
            </div>
            <div>
                <s:url var="url1" value="/jsp/userdetails">
                    <s:param name="userId" value="${user.id}"/>
                </s:url>
                <s:url var="url2" value="/jsp/{userId}/userdetails">
                    <s:param name="userId" value="${user.id}"/>
                </s:url>
                <a href="${url1}">See more user details</a>
                <a href="${url2}">See more user details</a>
            </div>
        </fieldset>

    </sf:form>

  
  </body>
  
</html>