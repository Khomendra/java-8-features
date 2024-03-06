
//2. Lambda expression with parameter
//Addition of two number using lambda expression
package com.java.lambda;

interface Addable{
    int sum(int a, int b);
}

class AddableImpl implements Addable{
    @Override
    public int sum(int a, int b) {
        return 0;
    }
}

public class LambdaParameter{
    public static void main(String []args){
        System.out.println("Sum of two numbers using lambda expression: ");
        Addable addition = (int a, int b) -> {
            int c = (a + b);
            return c;
        };
        int result = addition.sum(10, 20);
        System.out.println("Result: "+result);
    }
}

