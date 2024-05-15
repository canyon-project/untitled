package org.example;

public interface chen {

    void test();
    default void say(){
        System.out.println("aaa");
    }
}
