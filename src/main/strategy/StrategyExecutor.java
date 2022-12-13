package main.strategy;

import main.strategy.context.roupas.AbstractDresserContext;

import java.util.List;

public class StrategyExecutor {
    public static void validate(List<? extends IStrategy> strategies, AbstractDresserContext context){
        for (IStrategy s : strategies){
            s.vestirRoupas(context);
        }
    }
}
