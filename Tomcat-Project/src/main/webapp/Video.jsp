<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Video</title>
</head>
<body>
    <%
        response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
        String uname = (String) session.getAttribute("uname");
        if(uname==null)
        {
            response.sendRedirect("login.jsp");
        }
    %>
    <iframe width="560" height="315" src="https://www.youtube.com/embed/OuBUUkQfBYM?si=gCMYzfRBSeSjQyqZ" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
</body>
</html>
