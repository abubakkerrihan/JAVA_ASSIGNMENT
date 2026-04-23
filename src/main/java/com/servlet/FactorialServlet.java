package com.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("num"));
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        out.println("<h2>Factorial Result</h2>");
        out.println("<p>Number: " + num + "</p>");
        out.println("<p>Factorial: " + fact + "</p>");
    }
}