package com.qf.demo1.entity;
import java.util.Date;
/**
 * @author biubiu
 * @Data 2019/7/29
 */
public class User {
    private String name;
    private String password;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", date=" + date +
                '}';
    }
}
