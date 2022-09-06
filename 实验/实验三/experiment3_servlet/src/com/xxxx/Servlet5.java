package com.xxxx;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/s5")
public class Servlet5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String name="用户名："+req.getParameter("name")+"<br/>";
        String email="电子邮箱："+req.getParameter("email")+"<br/>";
        String address="通信地址："+req.getParameter("address")+"<br/>";
        String resume="个人简历："+req.getParameter("resume")+"<br/>";

        PrintWriter out=resp.getWriter();
        out.write("<h2>"+name+email+address+resume+"</h2>");
    }
}
