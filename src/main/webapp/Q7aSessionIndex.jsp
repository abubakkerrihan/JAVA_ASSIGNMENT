<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Session Management</title>

    <style>
        body{
            font-family: Arial;
            background:#f2f2f2;
            text-align:center;
            margin-top:100px;
        }

        .box{
            background:white;
            width:400px;
            margin:auto;
            padding:30px;
            border-radius:10px;
            box-shadow:0 0 10px gray;
        }

        input[type=text]{
            width:90%;
            padding:10px;
            margin-top:10px;
        }

        input[type=submit]{
            padding:10px 20px;
            background:#007bff;
            color:white;
            border:none;
            margin-top:20px;
            cursor:pointer;
            border-radius:5px;
        }

        input[type=submit]:hover{
            background:#0056b3;
        }
    </style>

</head>

<body>

<div class="box">

<h2>Session Management Program</h2>

<form action="Q7aWelcome.jsp" method="post">

    Enter Your Name:

    <br><br>

    <input type="text" name="username" required>

    <br>

    <input type="submit" value="Submit">

</form>

</div>

</body>
</html>