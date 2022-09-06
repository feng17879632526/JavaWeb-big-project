package com.xxxx;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/s6")
public class Servlet6 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String name=req.getParameter("name");
        String number=req.getParameter("number");
        System.out.println(name+number);
        PrintWriter out = resp.getWriter();
        out.write(check(number) ? "电话号码格式正确" : "电话号码格式错误");

    }
    boolean check(String s){
        String[] ss=s.split("-");
        if(ss.length!=3 || ss[0].length()!=3 || ss[1].length()!=4 || ss[2].length()!=4){
            return false;
        }
        for(String t: ss){
            for(int i=0; i<t.length(); i++){
                if(!Character.isDigit(t.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}
