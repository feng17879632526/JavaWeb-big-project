package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import service.CategoryService;
import vo.Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/category")
public class CategoryController extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        CategoryService categoryService = new CategoryService();
        List<Category> list = categoryService.findAll();
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(list);
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.write(jsonStr);
    }

}

