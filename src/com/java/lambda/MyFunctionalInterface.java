//4. @FunctionalInterface annotation is used to define functional interface explicitly.

package com.java.lambda;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String msg);

    default void message1(){
        System.out.println("default method");
    }

    static void message2(){
        System.out.println("static method");
    }
}
