package dao;

import vo.Book;

import java.util.List;

public interface BookDao {
    public List<Book> getBookByCategoryID(int category_id);
}
