package com.java.lambda;

interface Shape{
    void draw();
}

//Traditional approach to make overridden method
//class Rectangle implements Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("Rectangle class: draw() method");
//    }
//}

public class LambdaExample {
    public static void main(String []args){

        //Java 8 features to make overridden method
        Shape rectangle = () -> System.out.println("Rectangle class: draw() method");
        rectangle.draw();

        Shape square = () -> System.out.println("Square class: draw() method");
        square.draw();

        Shape circle = () -> System.out.println("Circle class: draw() method");
        circle.draw();

    }
}
