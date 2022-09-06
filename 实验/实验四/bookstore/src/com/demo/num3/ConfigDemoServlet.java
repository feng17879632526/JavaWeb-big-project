package com.demo.num3;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfigDemoServlet extends HttpServlet{
    String servletName=null;
    ServletContext servletContext=null;
    String email=null;
    String telephone=null;

    public void init() {
        servletContext=this.getServletContext();
        servletName = servletContext.getServletContextName();
        email = servletContext.getInitParameter("email");
        telephone = servletContext.getInitParameter("telephone");
        servletContext.log("email:"+email);
        servletContext.log("telephone:"+telephone);
    }

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException{
        response.setContentType("text/html;charset=gb2312");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Servlet名称："+servletName+"<br>");
        out.println("Email地址："+email+"<br>");
        out.println("电话："+telephone);
        out.println("</body></html>");
    }
}
