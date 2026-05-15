<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Session Status</title>

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
            background:#007bff;
            padding:10px 20px;
            border-radius:5px;
        }
    </style>

</head>

<body>

<div class="box">

<%
    String user = (String)session.getAttribute("username");

    if(user != null)
    {
%>

        <h2>Hello <%= user %> !</h2>

        <p>Session is Active.</p>

<%
    }
    else
    {
%>

        <h2>Session Expired!</h2>

        <p>Please enter your name again.</p>

        <br>

        <a href="Q7aSessionIndex.jsp">
            Go Back
        </a>

<%
    }
%>

</div>

</body>
</html>