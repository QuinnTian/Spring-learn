package com.ismeoh.DI.useXml.AOP3;

/**
 * *****************************************************************************
 *
 * @author : tk
 * @file : null.java
 * @brief : None
 * @attention : None
 * @date : 2023/3/5
 * *****************************************************************************
 */

public class UserInfo {
    private String userName;
    private String password;
    public UserInfo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public String getUserName() {
        return userName;
    }
}
