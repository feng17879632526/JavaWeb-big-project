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
    public String showBookByCategoryId(@RequestParam("id")String id, Model model){
        model.addAttribute("book",bookService.getBookByCategoryId(id));
        return "main";
    }

    @RequestMapping(value="{id}",method = RequestMethod.GET)
    public String getBookByCategoryId(@PathVariable("id")String id, Model model){
        model.addAttribute("book",bookService.getBookByCategoryId(id));
        return "main";
    }

    @RequestMapping(value="view")
    public String findBookByCategoryId(HttpServletRequest request){
        String id = request.getParameter("id");
        request.setAttribute("book",bookService.getBookByCategoryId(id));
        return "main";
    }

    @RequestMapping("json")
    @ResponseBody
    public List<Book> jsonBookByCategoryId(@RequestParam("id")String id, Model model){
        return bookService.getBookByCategoryId(id);
    }
}
