package org.example.AOP1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

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

public class AgentDecorator implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.print("James ");
        Object retVal = methodInvocation.proceed();
        System.out.println("!");
        return retVal;
    }
}
