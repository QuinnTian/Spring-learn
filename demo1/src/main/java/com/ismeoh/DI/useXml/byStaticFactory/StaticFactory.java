package com.ismeoh.DI.useXml.byStaticFactory;

/**
 * 静态工厂
 */
public class StaticFactory {
    private static StaticFactory staticFactory = new StaticFactory();
    private StaticFactory(){};

    public static StaticFactory creatInstance(){
        return staticFactory;
    }
}
