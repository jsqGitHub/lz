package com.zking.lz.Service;

import com.zking.lz.mapper.BookMapper;
import com.zking.lz.model.Book;
import com.zking.lz.util.PageBean;
import com.zking.lz.vo.BookVo;

import java.util.List;
import java.util.Map;

public class BookServiceImpl implements IBookService {

    private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public List<Book> queryBookByIds(BookVo bookVo) {
        return bookMapper.queryBookByIds(bookVo);
    }

    @Override
    public List<Book> queryBookLike(Book book) {
        return bookMapper.queryBookLike(book);
    }

    @Override
    public List<Book> queryBookResultMap() {
        return bookMapper.queryBookResultMap();
    }

    @Override
    public List<Book> queryBook() {
        return bookMapper.queryBook();
    }

    @Override
    public Book queryBookDg(Book book) {
        return bookMapper.queryBookDg(book);
    }

    @Override
    public List<Map<String, Object>> queryBookMap() {
        return bookMapper.queryBookMap();
    }

    @Override
    public Map<String, Object> queryBookMapDg() {
        return bookMapper.queryBookMapDg();
    }

    @Override
    public List<Book> queryBookPage(Book book, PageBean pageBean) {
        return bookMapper.queryBookPage(book);
    }

    @Override
    public List<Book> querBookPrice(BookVo bookVo) {
        return bookMapper.querBookPrice(bookVo);
    }

    @Override
    public List<Map<String, Object>> queryMakBook(BookVo bookVo) {
        return bookMapper.queryMakBook(bookVo);
    }

    @Override
    public List<Book> queryChoose(Book book) {
        return bookMapper.queryChoose(book);
    }

    @Override
    public void  delBook(BookVo bookVo) {
        bookMapper.delBook(bookVo);
    }

    @Override
    public void addBook(BookVo bookVo) {
        bookMapper.addBook(bookVo);
    }

    @Override
    public List<Map<String, Object>> queryMakBooks(BookVo bookVo) {
        return bookMapper.queryMakBooks(bookVo);
    }

    @Override
    public void updBook(BookVo bookVo) {
        bookMapper.updBook(bookVo);
    }


}
