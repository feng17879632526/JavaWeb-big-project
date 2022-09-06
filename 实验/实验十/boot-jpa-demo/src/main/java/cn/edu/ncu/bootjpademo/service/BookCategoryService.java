package cn.edu.ncu.bootjpademo.service;

import cn.edu.ncu.bootjpademo.dao.BookCategoryDao;
import cn.edu.ncu.bootjpademo.entity.BookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCategoryService {
    @Autowired
    private BookCategoryDao bookCategoryDao;
    /**
     @description 查询所有分类信息
     @param
     @return  List<BookCategory>
     */
    public List<BookCategory> findAll(){
        return bookCategoryDao.findAll();
    }
    public void saveBookCategory(BookCategory bookCategory) {
        bookCategoryDao.save(bookCategory);
    }
}