package main.strategy;

import main.strategy.context.roupas.AbstractDresserContext;
import main.strategy.context.roupas.Roupas;

public class Camista implements IDresserStrategy{

    @Override
    public void vestirRoupas(AbstractDresserContext abstractDresserContext) {
        Roupas roupas = (Roupas) abstractDresserContext;

        roupas.getRoupas().add("Camiseta");
    }
}
