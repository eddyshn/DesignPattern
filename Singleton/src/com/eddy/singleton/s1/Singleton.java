package com.eddy.singleton.s1;

/**
 * @program: Singleton
 * @description:
 * @author: Eddy.Shan
 * @create: 2019-09-05 13:06
 **/
public class Singleton {
    private Singleton() {
        System.out.println("s1");
    }

    private static final Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}
