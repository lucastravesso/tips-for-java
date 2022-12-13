package main.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// runtime para rodar a anotação só em tempo de exec
// e target em field para a anotação funcionar apenas em campos declarados de classes
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface maxValue {
    // cria um atributo pra anotação
    int value();

}
