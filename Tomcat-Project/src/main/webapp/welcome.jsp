<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <%
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        String uname = (String) session.getAttribute("uname");
        if (uname == null) {
            response.sendRedirect("login.jsp");
            return;
        }
    %>
    Welcome <%= uname %>
    <p>
    <a href="Video.jsp">Video</a>
    <p>
    <a href="FileUpload.jsp">File Upload</a>
    <p>
    <form action="Logout">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
