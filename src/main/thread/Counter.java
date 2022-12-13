package main.thread;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class Counter implements Runnable{

    private final String nomeDoThread;

    public Counter(String nomeDoThread){
        this.nomeDoThread = nomeDoThread;
    }

    @Override
    public void run(){
        ArrayList<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5));
        for (Integer i : nums){
            System.out.println("-> " + i + " <- processado pelo thread" + nomeDoThread);
            try {
                sleep(0x3e8);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
