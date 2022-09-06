package com.xxxx;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/getBook")
public class GetBook extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:E:\\Java Workspace\\实验六\\实验六  JSP+JDBC开发\\bookstore.db";
            String sql = "select id,name,author,price,image,description,category_id from book" +
                    " where category_id = ?";
            String categoryID = request.getParameter("id");
            Connection conn = DriverManager.getConnection(url);
            PreparedStatement pstat = conn.prepareStatement(sql);
            pstat.setString(1, categoryID);
            ResultSet rs = pstat.executeQuery();
            PrintWriter out=response.getWriter();
            while (rs.next()) {
                out.write("\r\n");
                out.write("<div class=\"col-sm-9 col-md-3\" >\r\n");
                out.write("    <div class=\"thumbnail\" ><img src=\"images/book.jpg\">\r\n");
                out.write("        <div class=\"caption\"><h4>\r\n");
                out.write("            ");
                out.print(rs.getString("name"));
                out.write("\r\n");
                out.write("        </h4>\r\n");
                out.write("            <p style=\"display: -webkit-box;\r\n");
                out.write("-webkit-box-orient: vertical;\r\n");
                out.write("-webkit-line-clamp: 3;\r\n");
                out.write("overflow: hidden;\">\r\n");
                out.write("                ");
                out.print(rs.getString("description"));
                out.write("\r\n");
                out.write("            </p>\r\n");
                out.write("            <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">加入购物车</a> <a href=\"#\" class=\"btn btn-default\"\r\n");
                out.write("                                                                              role=\"button\">查看详情\r\n");
                out.write("            </a></p></div>\r\n");
                out.write("    </div>\r\n");
                out.write("</div>\r\n");
            }
            pstat.close();
            conn.close();
//            request.getRequestDispatcher("index.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
