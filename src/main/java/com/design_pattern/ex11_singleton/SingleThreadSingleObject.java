package com.design_pattern.ex11_singleton;

public class SingleThreadSingleObject implements SingletonInterface{
    private static SingleThreadSingleObject object;

    private SingleThreadSingleObject() {}

    public static SingleThreadSingleObject getInstance(){
        if (object == null) {
            object = new SingleThreadSingleObject();
        }
        return object;
    }
}
