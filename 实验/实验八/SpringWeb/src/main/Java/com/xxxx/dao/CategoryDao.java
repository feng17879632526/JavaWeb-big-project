package com.xxxx.dao;

import com.xxxx.vo.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface CategoryDao {
    public void add(Category category);

    public void delete(Category category);

    public List<Category> findAll();
}
