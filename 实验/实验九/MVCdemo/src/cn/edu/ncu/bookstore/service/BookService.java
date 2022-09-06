package cn.edu.ncu.bookstore.service;

import cn.edu.ncu.bookstore.dao.BookDao;
import cn.edu.ncu.bookstore.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
    public List<Book> getBookByCategoryId(String id){
        return bookDao.findBookByCategoryId(id);
    }

}
