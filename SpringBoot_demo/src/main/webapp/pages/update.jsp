<html>
<title>Update</title>
<body>
    <h2>Update User</h2>
    <form action="/updateUser" method="post">
    <table>
        <tr>
                <td> <label>Id</label></td>
                <td><input type="number" name="id" required/><p> </td>
        </tr>
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