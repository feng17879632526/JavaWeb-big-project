package com.demo.num6;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        Student student=new Student();
        student.setName(req.getParameter("name"));
        student.setNumber(req.getParameter("number"));
        ServletContext servletContext=this.getServletContext();
        servletContext.setAttribute("student",student);
        servletContext.getRequestDispatcher("/SecondServlet").forward(req,resp);
    }
}
