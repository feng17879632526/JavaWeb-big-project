package cn.edu.ncu;

public class BookService {
    private String bookID;
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookService() {
    }
    public BookService(String bookID) {
        this.bookID = bookID;
    }

    public void addBook(){
        System.out.println(bookID);
    }
    public void deleteBookByID(String ID){
        bookDao.deleteBookByID(ID);
    }
}
