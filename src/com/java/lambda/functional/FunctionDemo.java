//6. way to use Function interface with lambda expression, which is available on java.util.function.Function.
//Function<String, Integer> ==> it' generic, Represent a function that accept one argument and
//produces a result. This is a FI, whose functional method is apply method.

package com.java.lambda.functional;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

public class FunctionDemo {
    public static void main(String []args){
        Function<String, Integer> function = (String s) -> s.length();
        System.out.println("Length: "+function.apply("Rakesh"));
    }
}
