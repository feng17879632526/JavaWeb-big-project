package com.demo.num6;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        ServletContext servletContext=getServletContext();
        Student student = (Student) servletContext.getAttribute("student");
        out.write("<h2>学号："+student.getNumber()+"<h2/>");
        out.write("<h2>姓名："+student.getName()+"<h2/>");
        out.write("<a href=\"http://localhost:8080/bookstore/input.html\">回到提交页面</a>");
    }
}
