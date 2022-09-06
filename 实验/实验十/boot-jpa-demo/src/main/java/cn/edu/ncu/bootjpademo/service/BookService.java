package cn.edu.ncu.bootjpademo.service;

import cn.edu.ncu.bootjpademo.dao.BookDao;
import cn.edu.ncu.bootjpademo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao dao;

    public List<Book> queryBook(String id){
        return dao.queryBook(id);
    }
}