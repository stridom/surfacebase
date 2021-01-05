package com.jnshu.Pojo;


import com.jnshu.Mapper.StudentDao;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class StudentDaoImple extends SqlSessionDaoSupport implements StudentDao {

    public Student findStudentById(int id) {
        return this.getSqlSession().selectOne("test.findStudentById",id);
    }

}