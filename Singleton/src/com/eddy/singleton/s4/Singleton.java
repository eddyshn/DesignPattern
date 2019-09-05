package com.eddy.singleton.s4;

/**
 * @program: Singleton
 * @description:
 * @author: Eddy.Shan
 * @create: 2019-09-05 14:07
 **/
public class Singleton {
    private Singleton() {
        System.out.println("s4");
    }

    private volatile static Singleton singleton = null;

    public static Singleton getInstance(){
        return LazySingleton.lazyInstance;
    }

    private static class LazySingleton{
        private static final Singleton lazyInstance = new Singleton();
    }
}
