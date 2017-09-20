package abstractFactory;

/**
 * Created by Sahil on 9/21/2017.
 */
public class FactoryProducer {
    public AbstractFactory getFactory(String name){
        AbstractFactory af = null;
        if(name.equalsIgnoreCase("color"))
            af = new ColorFactory();
        if(name.equalsIgnoreCase("shape"))
            af = new ShapeFactory();
        return af;
    }
}
