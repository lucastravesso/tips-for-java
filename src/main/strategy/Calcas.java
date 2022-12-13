package main.strategy;

import main.strategy.context.roupas.AbstractDresserContext;
import main.strategy.context.roupas.Roupas;

import java.util.ArrayList;
import java.util.List;

public class Calcas implements IDresserStrategy {

    @Override
    public void vestirRoupas(AbstractDresserContext abstractDresserContext) {
        Roupas roupas = (Roupas) abstractDresserContext;

        ArrayList<String> calcas = new ArrayList<>(List.of("Calcas"));
        roupas.setRoupas(calcas);
    }
}
