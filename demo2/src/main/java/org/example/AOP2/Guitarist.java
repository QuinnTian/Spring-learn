package org.example.AOP2;

/**
 * *****************************************************************************
 *
 * @author : tk
 * @file : Guitarist.java.java
 * @brief : None
 * @attention : None
 * @date : 2023/3/5
 * *****************************************************************************
 */

public class Guitarist implements Singer{
    private String lyric="You're gonna live forever in me";
    @Override
    public void sing(){
        System.out.println(lyric);
    }
}
