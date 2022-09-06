package cn.edu.ncu.bookstore.dao;

import cn.edu.ncu.bookstore.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    List<Book> findBookByCategoryId(@Param("id") String id);
}
