package strategy;

/**
 * Created by Sahil on 9/23/2017.
 */
public class Addition implements Strategy {
    public int operation(int a, int b) {
        return (a + b);
    }
}
