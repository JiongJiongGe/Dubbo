package com.api.domain;

import java.io.Serializable;

/**
 * user api返回Dto
 *
 * Created by yunkai on 2018/2/2.
 */
public class UserDto implements Serializable{

    private static final long serialVersionUID = -9143575147042150918L;

    private Integer id;

    private String userName; //用户名称

    private String userPhone;//用户联系方式

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
