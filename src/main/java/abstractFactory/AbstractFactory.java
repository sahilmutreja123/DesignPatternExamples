package abstractFactory;

/**
 * Created by Sahil on 9/21/2017.
 */
public interface AbstractFactory {
    Color getColor(String color);
    Shape getShape(String shape);
}
