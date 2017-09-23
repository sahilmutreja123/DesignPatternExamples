package strategy;

/**
 * Created by Sahil on 9/23/2017.
 */
public class StrategyPatternDemo {

    Strategy behaviour;

    public StrategyPatternDemo(Strategy behaviour) {
        this.behaviour = behaviour;
    }

    public int performOperation(int a, int b){
        return behaviour.operation(a,b);
    }
}

