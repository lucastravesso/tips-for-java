package main.annotation.validator;

import main.annotation.maxValue;

import java.lang.reflect.Field;

public class Validator {

    public static <T> boolean validate(T objeto){
        Class<?> classe = objeto.getClass();
        for (Field campo : classe.getDeclaredFields()){
            if (campo.isAnnotationPresent(maxValue.class)){
                maxValue maxValue = campo.getAnnotation(maxValue.class);
                try {
                    campo.setAccessible(true);
                    int valor = (int) campo.get(objeto);
                    return valor < maxValue.value();
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return false;
    }
}
