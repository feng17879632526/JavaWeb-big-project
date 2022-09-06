package service;

import dao.BookDao;
import dao.implPackage.BookDaoImpl;
import vo.Book;

import java.util.List;

public class BookService {
    private BookDao book=new BookDaoImpl();
    public List<Book> getBookByCategoryID(int category_id) {
        return book.getBookByCategoryID(category_id);
    }
}
