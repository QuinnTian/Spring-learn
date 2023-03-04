package org.example.AOP1;


import org.springframework.aop.framework.ProxyFactory;

/**
 * *****************************************************************************
 *
 * @author : tk
 * @file : null.java
 * @brief : None
 * @attention : None
 * @date : 2023/3/4
 * *****************************************************************************
 */

public class AgentAOPDemo {
    public static void main(String... args) {
        /**
         * target object 目标对象
         * 是指一个能被AOP修改其执行流程的对象
         */
        Agent target = new Agent();
        /* 创建代理工厂 */
        ProxyFactory pf = new ProxyFactory();
        /* 添加advice */
        pf.addAdvice(new AgentDecorator());
        // 设置目标
        pf.setTarget(target);
        // 获取代理
        Agent proxy = (Agent) pf.getProxy();
        target.speak();

        System.out.println("");

        proxy.speak();
    }
}
