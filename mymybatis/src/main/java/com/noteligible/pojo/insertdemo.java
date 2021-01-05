package com.noteligible.pojo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class insertdemo {
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
        for(int i=4;i<10001;i++){
            User a = new User();
            a.setId(i);
            a.setName("lucy");
            int ser = sqlSession.insert("add",a);
            if(i%1000==0){
                System.out.println("finish insert ---"+i);
            }
        }
        sqlSession.commit();
        // 6. 打印结果
//        System.out.println(ser);
        // 7. 释放资源
        sqlSession.close();
    }
}
