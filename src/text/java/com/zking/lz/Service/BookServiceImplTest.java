package com.zking.lz.Service;

import com.github.pagehelper.PageHelper;
import com.sun.org.apache.xerces.internal.xs.StringList;
import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import com.zking.lz.mapper.BookMapper;
import com.zking.lz.model.Book;
import com.zking.lz.util.PageBean;
import com.zking.lz.util.SqlSessionFactoryUtils;
import com.zking.lz.vo.BookVo;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class BookServiceImplTest {
    private IBookService iBookService;
    private SqlSession sqlSession;

    @Before
    public void setUp() throws Exception {
        sqlSession = SqlSessionFactoryUtils.openSqlSession();
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.setBookMapper(mapper);
        iBookService=bookService;
    }

    @After
    public void tearDown() throws Exception {
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void insert() {
        Book book = new Book();
        book.setBookname("黎铮自转");
        book.setPrice(100f);
        book.setBooktype("高级！");
        iBookService.insert(book);
    }

    @Test
    public void query() {

        Book b = new Book();
        Book b1 = new Book();
        b.setId(255);
        b1.setId(256);
        List<Book> lst = new ArrayList<>();
        lst.add(b);
        lst.add(b1);
        BookVo bookVo = new BookVo();
        bookVo.setLstBook(lst);
        iBookService.updBook(bookVo);


//        Map<String ,Object> map = new HashMap<String ,Object>();
//        map.put("1",255);
//        map.put("2",156);

//        List<Map<String,Object>> lst = new ArrayList<Map<String, Object>>();
//        lst.add(map);
//        BookVo lsts = new BookVo();
//        lsts.setLstMap(lst);
//
//
//        List<Map<String, Object>> maps = iBookService.queryMakBooks(lsts);
//        for (Map<String,Object> map1:maps
//             ) {
//            System.out.println(map1);
//        }


//        BookVo bookVo = new BookVo();
//        bookVo.setIds(Arrays.asList(new Integer[]{21,13}));
//
//        iBookService.delBook(bookVo);

//        Book book = new Book();
//        Book book1 = new Book();
//        book.setBookname("213");
//        book.setPrice(1111F);
//        book.setBooktype("L");
//        book1.setBookname("213");
//        book1.setPrice(1111F);
//        book1.setBooktype("L");
//        List<Book> lst = new ArrayList<Book>();
//        lst.add(book);
//        lst.add(book1);
//
//        BookVo bookVo = new BookVo();
//        bookVo.setLstBook(lst);
//
//        iBookService.addBook(bookVo);

//        List<Map<String, Object>> maps = iBookService.queryMakBook(bookVo);
//        for (Map<String,Object> map:maps) {
//            System.out.println(map);
//        }

//        Book book  = new Book();
////        book.setBookname("1");
////        book.setId(6);
//        book.setPrice(1000f);
//
//        List<Book> books = iBookService.queryChoose(book);
//        for (Book b:books
//             ) {
//            System.out.println(b);
//        }

//        PageBean pageBean = new PageBean();
//        pageBean.setPagination(true);
//        pageBean.setPage(1);
//        pageBean.setRows(8);
//
//        if(null!=pageBean&&pageBean.isPagination()){
//            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
//            List<Book> books = iBookService.queryBookPage(book, pageBean);
//            for (Book b:books) {
//                System.out.println(b);
//            }
//
//        }


//        bookVo.setMin(100f);
//        bookVo.setMax(1000f);
//        List<Book> books = iBookService.querBookPrice(bookVo);
//        for (Book b:books) {
//            System.out.println(b);
//        }

    }
}