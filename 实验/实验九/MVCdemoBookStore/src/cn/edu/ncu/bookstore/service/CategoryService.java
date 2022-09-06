package cn.edu.ncu.bookstore.service;

import cn.edu.ncu.bookstore.dao.CategoryDao;
import cn.edu.ncu.bookstore.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    public List<Category> findAll(){
        return categoryDao.findAll();
    }
}
