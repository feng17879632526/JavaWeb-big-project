package cn.edu.ncu.bootjpademo.controller;


import cn.edu.ncu.bootjpademo.entity.Book;
import cn.edu.ncu.bootjpademo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("")
    public List<Book> queryBook(@RequestParam String id){
        return bookService.queryBook(id);
    }
}
