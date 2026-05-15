<%@ page language="java" contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Cookie Management</title>

    <style>
        body{
            font-family:Arial;
            background:#f2f2f2;
            text-align:center;
            margin-top:80px;
        }

        .box{
            width:450px;
            background:white;
            margin:auto;
            padding:30px;
            border-radius:10px;
            box-shadow:0 0 10px gray;
        }

        input[type=text],
        input[type=number]{
            width:90%;
            padding:10px;
            margin-top:10px;
        }

        input[type=submit]{
            margin-top:20px;
            padding:10px 20px;
            background:#007bff;
            color:white;
            border:none;
            border-radius:5px;
            cursor:pointer;
        }

        input[type=submit]:hover{
            background:#0056b3;
        }
    </style>
</head>

<body>

<div class="box">

<h2>Cookie Management Program</h2>

<form action="Q7bAddCookie.jsp" method="post">

    Cookie Name:
    <br>
    <input type="text" name="cname" required>

    <br><br>

    Domain:
    <br>
    <input type="text" name="domain" required>

    <br><br>

    Max Expiry Age (Seconds):
    <br>
    <input type="number" name="age" required>

    <br>

    <input type="submit" value="Add Cookie">

</form>

</div>

</body>
</html>