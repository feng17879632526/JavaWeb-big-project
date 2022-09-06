package cn.edu.ncu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookServiceTest {
    @org.junit.Test
    public void addBook(){
        ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = (BookService) context.getBean("bookService");
        BookService service2 = (BookService) context.getBean("bookService");
        System.out.println(service);
//        System.out.println(service2);
        service.addBook();
    }
    @Test
    public void testBookVo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = (Book)context.getBean("book");
        System.out.println(book.getBookName());
    }
    @Test
    public void deleteBookByID(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = (BookService)context.getBean("bookService");
        System.out.println(service);
        service.deleteBookByID("9527");
    }
}
