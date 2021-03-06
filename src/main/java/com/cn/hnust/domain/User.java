package com.cn.hnust.domain;

import java.io.Serializable;

public class User implements Serializable {

    /**  */
    private static final long serialVersionUID = -1088589830163612283L;

    private Long              id;

    private String            name;

    private String            password;

    private Integer           age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}