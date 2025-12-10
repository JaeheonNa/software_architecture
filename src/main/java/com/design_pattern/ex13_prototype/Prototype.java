package com.design_pattern.ex13_prototype;

import java.util.ArrayList;
import java.util.List;

public class Prototype {
    public static void main(String[] args){
        /** Prototype은 새로 생성되지만, prototype이 가리키는 객체는 같은 객체임.**/
        Cloneable prototype = new ShallowPrototype();
        Cloneable clone = prototype.clone();

        /** Prototype도 새로 생성되고, prototype이 가리키는 객체도 새로 생성됨. **/
        List<Graphic> graphicList = new ArrayList<>();
        Graphic line = new Line();
        Graphic rectangle = new Rectangle();
        graphicList.add(line);
        graphicList.add(rectangle);
        for (Graphic gp : graphicList) {
            Graphic clone1 = gp.clone();
        }
    }
}
