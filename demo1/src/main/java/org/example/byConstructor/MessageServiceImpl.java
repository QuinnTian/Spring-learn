package org.example.byConstructor;

import org.springframework.stereotype.Service;

@Service // 此注解表示声明一个Javabean
public class MessageServiceImpl implements MessageService {
    private String userName;
    private int age;

    /**
     * 构造方法含参数
     * @param userName 用户名
     * @param age 年龄
     */
    public MessageServiceImpl(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    /**
     * 获取用户名
     * @return 用户名
     */
    public String getMessage() {
        return "Hi"+" "+userName+"age is " + age;
    }
}
