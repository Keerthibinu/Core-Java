<%@ page import="com.keerthi.Details" %>
<%@ page import="java.util.List" %>
<%@ page import="com.keerthi.UserService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display</title>
</head>
<body>
<strong> Id &nbsp;&nbsp; Name &nbsp;&nbsp; Username </strong><p></p>
<%
    List<Details> users = (List<Details>) request.getAttribute("users");
    if (users != null) {
        for (Details user : users) { %>
    <%= user.getId() %> &nbsp;&nbsp;
    <%= user.getName() %> &nbsp;&nbsp;
    <%= user.getUsername() %> &nbsp;&nbsp;
<br>
<%
        }
    }
%>
</body>
</html>