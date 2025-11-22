package com.design_pattern.ex09_chainOfResponsibility;

import com.design_pattern.ex09_chainOfResponsibility.handler.FirstHandler;
import com.design_pattern.ex09_chainOfResponsibility.handler.Handler;
import com.design_pattern.ex09_chainOfResponsibility.handler.SecondHandler;
import com.design_pattern.ex09_chainOfResponsibility.handler.ThirdHandler;

public class ChainOfResponsibility {
    public static void main(String[] args){
        Handler h1 = new FirstHandler();
        Handler h2 = new SecondHandler();
        Handler h3 = new ThirdHandler();
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        int[] requests = {2, 5, 14, 22, 18, 3, 27, 30};
        for (int request :requests){
            h1.handleRequest(request);
        }
    }
}
