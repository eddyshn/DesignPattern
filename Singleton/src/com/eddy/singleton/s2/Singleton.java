package com.eddy.singleton.s2;

/**
 * @program: Singleton
 * @description:
 * @author: Eddy.Shan
 * @create: 2019-09-05 13:11
 **/
public class Singleton {
    private Singleton() {
        System.out.println("s2");
    }

    private static Singleton singleton = null;

    public static Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
