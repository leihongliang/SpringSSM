package com.lei.service;
import com.lei.dao.BookMapper;
import com.lei.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
//@Service
public class BookServiceImpl implements BookService {
    /**
     * service调dao层，组合Dao
     * spring横切
     */
//    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    public List<Books> queryBook(String bookName) {
        return bookMapper.queryBook(bookName);
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}

