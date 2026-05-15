<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%
    String name = request.getParameter("username");

    session.setAttribute("username", name);

    // Session expiry time = 60 seconds
    session.setMaxInactiveInterval(60);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>

    <style>
        body{
            font-family:Arial;
            background:#f2f2f2;
            text-align:center;
            margin-top:100px;
        }

        .box{
            background:white;
            width:450px;
            margin:auto;
            padding:30px;
            border-radius:10px;
            box-shadow:0 0 10px gray;
        }

        a{
            text-decoration:none;
            color:white;
            background:green;
            padding:10px 20px;
            border-radius:5px;
        }
    </style>

</head>

<body>

<div class="box">

<h2>
    Hello <%= session.getAttribute("username") %> !
</h2>

<p>
    Session will expire after 1 minute.
</p>

<br>

<a href="Q7aCheckSession.jsp">
    Check Session Status
</a>

</div>

</body>
</html>