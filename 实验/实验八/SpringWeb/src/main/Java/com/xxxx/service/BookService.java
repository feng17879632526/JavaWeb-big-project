package com.xxxx.service;

import com.xxxx.dao.BookDao;
import com.xxxx.dao.implPackage.BookDaoImpl;
import com.xxxx.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {
    @Autowired
    private BookDao book;
    public List<Book> getBookByCategoryID(int category_id) {
        return book.getBookByCategoryID(category_id);
    }
}
