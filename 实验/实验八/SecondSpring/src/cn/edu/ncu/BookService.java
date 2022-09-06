package cn.edu.ncu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private  BookDao bookDao;
    public void addBook(){
        bookDao.addBook();
    }
}
