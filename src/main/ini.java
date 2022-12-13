package main;

import main.annotation.domain.Conta;
import main.annotation.validator.Validator;

public class ini {

    public static void main(String[] args) {

        Conta conta = new Conta("Conta 1 ", 4000);
        System.out.println(Validator.validate(conta));


//        Counter c1 = new Counter("Thread 1");
//        Counter c2 = new Counter("Thread 2");
//        Counter c3 = new Counter("Thread 3");
//
//        Thread thread1 = new Thread(c1);
//        Thread thread2 = new Thread(c2);
//        Thread thread3 = new Thread(c3);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//        Generic<Integer> genInteger = new Generic<>();
//
//        genInteger.show(123);
    }
}
