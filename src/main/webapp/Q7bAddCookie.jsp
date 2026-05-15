<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<%
    String cname = request.getParameter("cname");
    String domain = request.getParameter("domain");
    int age = Integer.parseInt(request.getParameter("age"));

    Cookie ck = new Cookie(cname, domain);

    ck.setMaxAge(age);

    response.addCookie(ck);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Cookie Added</title>

    <style>
        body{
            font-family:Arial;
            background:#f2f2f2;
            text-align:center;
            margin-top:80px;
        }

        .box{
            width:500px;
            background:white;
            margin:auto;
            padding:30px;
            border-radius:10px;
            box-shadow:0 0 10px gray;
        }

        a{
            text-decoration:none;
            background:green;
            color:white;
            padding:10px 20px;
            border-radius:5px;
        }
    </style>
</head>

<body>

<div class="box">

<h2>Cookie Added Successfully</h2>

<p>
    <b>Cookie Name:</b>
    <%= cname %>
</p>

<p>
    <b>Domain:</b>
    <%= domain %>
</p>

<p>
    <b>Max Expiry Age:</b>
    <%= age %> seconds
</p>

<br>

<a href="Q7bShowCookies.jsp">
    Go To Active Cookie List
</a>

</div>

</body>
</html>