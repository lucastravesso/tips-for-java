package main.thread;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

// classe implementando o runnable que possibilita instanciar um novo thread e
// é uma implementação entao nao impede voce de extender essa classe de outra
public class Counter implements Runnable{

    // nomeando thread para ver o funcionamento
    private final String nomeDoThread;

    public Counter(String nomeDoThread){
        this.nomeDoThread = nomeDoThread;
    }

    // dar override no metodo run do thread mas quando chamar ele deve ser usado o .start para funcionar a implementação
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
