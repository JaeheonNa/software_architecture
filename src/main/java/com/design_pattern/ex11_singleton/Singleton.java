package com.design_pattern.ex11_singleton;

public class Singleton {
    public static void main(String[] args) {

        /** 싱글 스레드일 땐 이 방법이 가장 간편함. **/
        SingletonInterface singleThreadSingletonObject = SingleThreadSingleObject.getInstance();

        /** 멀티 스레드일 땐, 동시성 이슈로 인해 위 방법으로는 객체의 '유일성'을 보장할 수 없음. 따라서 아래와 같이 변경해줘야 함. **/
        /** syncronized를 이용한 가장 간단한 방법. 단, 해당 클래스에 lock이 너무 잦게 걸리므로 성능 이슈 있음. **/
        SingletonInterface multiThreadSingletonObject_1 = MultiThreadSingleObject_1.getInstance();
        /** lock을 최소한으로 하되, 대신 synchronized 앞뒤로 체크를 두 번 하는 방법. 단, 코드 자체가 좀 복잡함. **/
        SingletonInterface multiThreadSingletonObject_2 = MultiThreadSingleObject_2.getInstance();
        /** 가장 간단한 방법. 컴파일러로 어플리케이션을 구동하는 시점에 미리 만들어놓는 방법. 단, 만약 런타임에 사용하지 않는다면, 메모리 낭비일 수 있음. Spring에서 사용하는 방법. **/
        SingletonInterface multiThreadSingletonObject_3 = MultiThreadSingleObject_3.getInstance();



    }
}
