package com.design_pattern.ex11_singleton;

public class MultiThreadSingleObject_3 implements SingletonInterface{
    private static MultiThreadSingleObject_3 object = new MultiThreadSingleObject_3();

    private MultiThreadSingleObject_3() {}

    public static MultiThreadSingleObject_3 getInstance(){
        return object;
    }
}
