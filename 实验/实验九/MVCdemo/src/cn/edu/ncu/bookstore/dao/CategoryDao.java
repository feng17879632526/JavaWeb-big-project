package cn.edu.ncu.bookstore.dao;

import cn.edu.ncu.bookstore.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryDao {
    List<Category> findAll();
}
