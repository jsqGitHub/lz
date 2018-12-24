package com.zking.lz.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SqlSessionFactoryUtils {
    private static SqlSessionFactory sqlSessionFactory;
    private  static  ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();

    static {
        try {
            InputStream is = SqlSessionFactoryUtils.class.getResourceAsStream("/mybatis.cfg.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  static  SqlSession openSqlSession(){
        SqlSession sqlSession = threadLocal.get();
        if(null==sqlSession){
            sqlSession = sqlSessionFactory.openSession();
            threadLocal.set(sqlSession);
        }
        return sqlSession;
    }

    public static void closeSqlSession(){
        SqlSession sqlSession = threadLocal.get();
        if(null!=sqlSession){
            sqlSession.close();
            threadLocal.set(null);
        }
    }

    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession();
        System.out.println(sqlSession);
        System.out.println(sqlSession.getConnection());
        System.out.println("已经打开了！");
        SqlSessionFactoryUtils.closeSqlSession();
        System.out.println("已经关闭了！");

    }

}
