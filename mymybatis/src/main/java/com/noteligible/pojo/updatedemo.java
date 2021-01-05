package com.noteligible.pojo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class updatedemo {
    private static SqlSessionFactory sqlSessionFactory;

    //    private SqlSessionFactory sqlSessionFactory = null;
    public static void main(String[] args) throws IOException {
        // 1. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 2. 加载SqlMapConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 3. 创建SqlSessionFactory对象
        sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        // 4. 创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 5. 执行SqlSession对象执行查询，获取结果User
        // 第一个参数是UserMapper.xml的statement的id，第二个参数是执行sql需要的参数；
//        User user = sqlSession.selectOne("queryUserById",1);

        User mould = new User();
        mould.setName("testname");
        mould.setNickname("Niel");
        mould.setSex("未");
        mould.setIn_time(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        int ser = sqlSession.update("Updata",mould);
        sqlSession.commit();
        // 6. 打印结果
//        System.out.println(ser);
        // 7. 释放资源
        sqlSession.close();
    }
}
