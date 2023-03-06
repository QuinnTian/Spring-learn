package org.example.AOP3;

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

public class SecurityManager {
    private static ThreadLocal<UserInfo>
            threadLocal = new ThreadLocal<>();
    public void login(String userName, String password) {
        threadLocal.set(new UserInfo(userName, password));
    }
    public void logout() {
        threadLocal.set(null);
    }
    public UserInfo getLoggedOnUser() {
        return threadLocal.get();
    }
}
