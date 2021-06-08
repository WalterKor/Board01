<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <a href="/user/join">회원가입</a>
    <form action="login" method="post">
        <div><input type="text" name="uid" placeholder="id" value="789"></div>
        <div><input type="password" name="upw" placeholder="pw" value="789"></div>
        <div>
            <input type="submit" value="login">
        </div>
    </form>
</body>
</html>
