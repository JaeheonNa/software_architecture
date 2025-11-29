package com.design_pattern.ex11_singleton;

public class MultiThreadSingleObject_2 implements SingletonInterface{
    private volatile static MultiThreadSingleObject_2 object;

    private MultiThreadSingleObject_2() {}

    public static synchronized MultiThreadSingleObject_2 getInstance(){
        if (object == null) {
            synchronized (MultiThreadSingleObject_2.class) {
                if (object == null) {
                    object = new MultiThreadSingleObject_2();
                }
            }
        }
        return object;
    }
}
