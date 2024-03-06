//5. Traditional way to use Function interface which is available on java.util.function.Function.

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
        Function<String, Integer> function = new FunctionImpl();
        System.out.println("Length: "+function.apply("Rakesh"));
    }
}
