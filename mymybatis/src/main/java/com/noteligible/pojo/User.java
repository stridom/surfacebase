package com.noteligible.pojo;

public class User {
    private int id;
    private String name;
    private String nickname;
    private String sex;
    private String in_time;
    public User(int id,String name,String nickname,String sex,String in_time){
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.sex = sex;
        this.in_time = in_time;
    }
    public User(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getIn_time() {
        return in_time;
    }

    public void setIn_time(String in_time) {
        this.in_time = in_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex='" + sex + '\'' +
                ", in_time='" + in_time + '\'' +
                '}';
    }
}
