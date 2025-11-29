package com.design_pattern.ex11_singleton;

public class MultiThreadSingleObject_1 implements SingletonInterface{
    private static MultiThreadSingleObject_1 object;

    private MultiThreadSingleObject_1() {}

    public static synchronized MultiThreadSingleObject_1 getInstance(){
        if (object == null) {
            object = new MultiThreadSingleObject_1();
        }
        return object;
    }
}
