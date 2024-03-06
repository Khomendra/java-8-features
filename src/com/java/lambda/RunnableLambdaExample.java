package com.java.lambda;

//traditional way to create a thread

class ThreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("run method called ....");
    }
}
public class RunnableLambdaExample {
    public static void main(String []args){
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        Runnable runnable = () -> System.out.println("run method called using lambda expression");

        Thread threadLambda = new Thread(runnable);
        threadLambda.start();
    }
}
