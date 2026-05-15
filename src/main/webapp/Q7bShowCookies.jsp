<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Active Cookies</title>

    <style>
        body{
            font-family:Arial;
            background:#f2f2f2;
            text-align:center;
            margin-top:80px;
        }

        .box{
            width:600px;
            background:white;
            margin:auto;
            padding:30px;
            border-radius:10px;
            box-shadow:0 0 10px gray;
        }

        table{
            width:100%;
            border-collapse:collapse;
        }

        th, td{
            border:1px solid black;
            padding:10px;
        }

        th{
            background:#007bff;
            color:white;
        }
    </style>
</head>

<body>

<div class="box">

<h2>Active Cookie List</h2>

<table>

<tr>
    <th>Cookie Name</th>
    <th>Cookie Value</th>
</tr>

<%
    Cookie cookies[] = request.getCookies();

    if(cookies != null)
    {
        for(Cookie c : cookies)
        {
%>

<tr>
    <td><%= c.getName() %></td>
    <td><%= c.getValue() %></td>
</tr>

<%
        }
    }
%>

</table>

</div>

</body>
</html>