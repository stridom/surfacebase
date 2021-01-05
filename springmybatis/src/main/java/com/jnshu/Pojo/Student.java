package com.jnshu.Pojo;

import java.sql.Date;

public class Student {
    private int id;
    private String name;
    private String nickname;
    private String sex;
    private Date in_time;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getIn_time() {
        return in_time;
    }

    public void setIn_time(Date in_time) {
        this.in_time = in_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name, String nickname, String sex, Date in_time){
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.sex = sex;
        this.in_time = in_time;
    }





    /**
     * @Override 的作用是：如果想重写父类的方法，比如toString()方法的话，
     * 在方法前面加上@Override 系统可以帮你检查方法的正确性。
     *
     *  toString 方法会返回一个“以文本方式表示”此对象的字符串。
     * @return
     */

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname=" + nickname +
                ", sex=" + sex +
                ", in_time=" + in_time +
                '}';
    }
}