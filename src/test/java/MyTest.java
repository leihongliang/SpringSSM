import com.lei.pojo.Books;
import com.lei.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService)applicationContext.getBean("BookServiceImpl");
        List<Books> books = bookService.queryAllBooks();
        for (Books book : books) {
            System.out.println(book);
        }
    }
    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService)applicationContext.getBean("BookServiceImpl");
        Books books = new Books();
        books.setBookName("bibel");
        books.setBookCounts(1);
        books.setDetail("圣经2");
        int res = bookService.addBook(books);
    }
}
