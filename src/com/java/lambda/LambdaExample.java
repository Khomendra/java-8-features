//Pass lambda expression as a function parameter

package com.java.lambda;

interface Shape{
    void draw();
}

public class LambdaExample {
    public static void main(String []args){

        //Java 8 features to make overridden method
        Shape rectangle = () -> System.out.println("Rectangle class: draw() method");


        Shape square = () -> System.out.println("Square class: draw() method");


        Shape circle = () -> System.out.println("Circle class: draw() method");

        print(rectangle);
        print(square);
        print(circle);

    }

    private static void print(Shape shape){
        shape.draw();
    }
}
