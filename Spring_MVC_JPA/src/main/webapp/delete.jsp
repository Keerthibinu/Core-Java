<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete User</title>
</head>
<body>
<form action="delete" method="post">
    <label>Enter userId to be deleted:
        <input type="number" name="userId" required/>
    </label><br>
    <input type="submit" value="Delete">
</form>
</body>
</html>
