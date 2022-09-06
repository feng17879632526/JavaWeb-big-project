package com.xxxx;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
//@WebServlet("/s7")
public class Servlet7 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();
        ServletContext con =this.getServletContext();
        HashMap<String,Integer> result= (HashMap<String, Integer>) con.getAttribute("result");
        if(result==null){
            result= new HashMap<String, Integer>();
            con.setAttribute("result",result);
        }
        String [] checkone = req.getParameterValues("interest");
        if(checkone!=null){
            for(String str:checkone){
                if(!result.containsKey(str)){
                    result.put(str,1);
                }
                else{
                    result.put(str,result.get(str)+1);
                }
            }
        }
        out.write("<h1>各兴趣喜爱人数统计</h1>");
        for(Map.Entry<String,Integer> entry:result.entrySet()){
            out.write("<h2>"+entry.getKey()+":"+entry.getValue()+"</h2>");
        }
    }
}
