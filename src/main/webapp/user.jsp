<%--
  Created by IntelliJ IDEA.
  User: Gosienka
  Date: 04.08.2019
  Time: 09:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<from method="post">
    Name:<br><input type="text" name="name"><br>
    Password:<br><input type="text" name="password"><br>
    <input type="submit"><br>
</from>
    Name from session: ${sessionScope.userNameSessionName}<br>
    Password from session: ${sessionScope.userPasswordSessionName}
</body>
</html>
