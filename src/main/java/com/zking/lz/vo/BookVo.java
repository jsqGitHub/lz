package com.zking.lz.vo;

import com.zking.lz.model.Book;
import org.omg.CORBA.OBJECT_NOT_EXIST;

import java.util.List;
import java.util.Map;

public class BookVo extends Book {
    private List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    private float min;
    private float max;

    public void setMin(float min) {
        this.min = min;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public float getMin() {

        return min;
    }

    public float getMax() {
        return max;
    }

    private List<Book> lstBook;

    public List<Book> getLstBook() {
        return lstBook;
    }

    public void setLstBook(List<Book> lstBook) {
        this.lstBook = lstBook;
    }


    private List<Map<String,Object>> lstMap;

    public List<Map<String, Object>> getLstMap() {
        return lstMap;
    }

    public void setLstMap(List<Map<String, Object>> lstMap) {
        this.lstMap = lstMap;
    }
}
