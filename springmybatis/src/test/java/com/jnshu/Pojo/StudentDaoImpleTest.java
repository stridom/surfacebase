package com.jnshu.Pojo;

import com.jnshu.Mapper.StudentDao;
import com.jnshu.Pojo.Student;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDaoImpleTest {
    private ApplicationContext context;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void insertStudent() {
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
//        Student student = new Student(1);
        Student out = studentDao.findStudentById(1);
        System.out.println(out.toString());
    }
}