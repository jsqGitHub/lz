package com.zking.lz.mapper;

import com.zking.lz.model.Book;
import com.zking.lz.vo.BookVo;

import java.util.List;
import java.util.Map;

public interface BookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    /*
     * 案例1:foreach标签
     * */

    List<Book> queryBookByIds(BookVo bookVo);


    /*
     * 案例2:模糊查询三种方式
     * 1：#{...}
     * 2:${...}
     * 3.concat
     * */

    List<Book> queryBookLike(Book book);

    /*
     * 案例3:查询返回ResultMap
     * */

    List<Book> queryBookResultMap();

    /*
     * 案例4:查询返回ResultType之List<T>
     * */

    List<Book> queryBook();

    /*
     * 案例5:查询返回ResultType之单个对象
     * */

    Book queryBookDg(Book book);

    /*
     * 案例6:查询返回ResultType之List<Map<String,Object>>
     * */

    List<Map<String,Object>> queryBookMap();


    /*
     * 案例7:查询返回ResultType之Map<String,Object>
     * */
    Map<String,Object> queryBookMapDg();

    /*
     * 案例8:分页查询
     * */
    List<Book> queryBookPage(Book book);


    /*
     * 案例9:范围查询
     * */

    List<Book> querBookPrice(BookVo bookVo);

    /**
     * 使用foreach标签遍历map集合 item是value index是key
     */

    List<Map<String,Object>> queryMakBook(BookVo bookVo);

    /**
     * choose查询语句
     */

    List<Book> queryChoose(Book book);

    /**
     * 根据ID批量删除数据
     */

    void delBook(BookVo bookVo);


    /**
     * 添加多条数据
     */

    void addBook(BookVo bookVo);


    /**
     * 使用foreach标签遍历map集合 item是value index是key
     */

    List<Map<String,Object>> queryMakBooks(BookVo bookVo);


    /**
     * 修改多条数据
     */

    void updBook(BookVo bookVo);


}