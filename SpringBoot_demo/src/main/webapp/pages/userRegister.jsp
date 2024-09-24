<html>
<title>Register</title>
<body>
    <h2>Register</h2>
    <form action="/create" method="post">
    <table>
        <tr>
            <td> <label>Name</label></td>
            <td><input type="text" name="name" required/><p> </td>
        </tr>
        <tr>
            <td> <label>Username</label></td>
            <td> <input type="text" name="username" required/><p> </td>
        </tr>
        <tr>
            <td> <label>Password</label></td>
            <td> <input type="password" name="password" required/><p> </td>
        </tr>
            <td> <input type="submit" name="Submit"/> </td>
    </table>
</body>
</html>