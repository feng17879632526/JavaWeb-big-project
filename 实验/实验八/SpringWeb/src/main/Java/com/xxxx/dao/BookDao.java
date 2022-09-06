package com.xxxx.dao;

import com.xxxx.vo.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface BookDao {
    public List<Book> getBookByCategoryID(int category_id);
}
