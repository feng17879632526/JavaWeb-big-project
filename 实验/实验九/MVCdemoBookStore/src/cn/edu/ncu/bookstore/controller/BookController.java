package cn.edu.ncu.bookstore.controller;

import cn.edu.ncu.bookstore.entity.Book;
import cn.edu.ncu.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("")
    public String showBookByCategoryId(){
        return "main";
    }

    @RequestMapping("json")
    @ResponseBody
    public List<Book> jsonBookByCategoryId(@RequestParam("id")String id, Model model){
        return bookService.getBookByCategoryId(id);
    }
}
