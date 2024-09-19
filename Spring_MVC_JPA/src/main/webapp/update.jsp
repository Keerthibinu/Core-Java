<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Details</title>
</head>
<body>
<form action="update" method="post">
    <label>Enter id to be updated:
        <input type="number" name="id" required/>
    </label><br>
    <label>Enter new name:
        <input type="text" name="name" required/>
    </label><br>
    <label>Enter new username:
        <input type="text" name="username" required>
    </label><br>
    <label>Enter new password:
        <input type="password" name="pass" required>
    </label><br>
    <input type="submit" value="Update">
</form>
</body>
</html>
