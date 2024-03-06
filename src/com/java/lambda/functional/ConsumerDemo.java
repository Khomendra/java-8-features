//7. Traditional way to write Consumer interface with Functional Interface

package com.java.lambda.functional;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{

    @Override
    public void accept(String input) {
        System.out.println(input);
    }
}

public class ConsumerDemo {
    public static void main(String []arg){
        Consumer<String> consumer = new ConsumerImpl();
        consumer.accept("Hello Bro");
    }
}
