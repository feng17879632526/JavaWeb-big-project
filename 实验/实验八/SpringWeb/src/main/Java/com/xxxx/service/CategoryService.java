package com.xxxx.service;

import com.xxxx.dao.CategoryDao;
import com.xxxx.dao.implPackage.*;
import com.xxxx.vo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.List;
@Service
public class CategoryService {
    @Autowired
    private CategoryDao category;

    public List<Category> findAll() {
        return category.findAll();
    }
}
