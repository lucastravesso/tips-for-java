package main.generic;

public class Generic <T> {

    // classe generica para receber qualquer tipo de parametro, classe generica exemplo um ArrayList<> <- que é generico tambem
    public void show(T variable){
        System.out.println(variable);
    }
}
