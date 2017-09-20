package factory;

/**
 * Created by Sahil on 9/21/2017.
 */
public class ShapeFactory {

    public Shape getShape(String name){
        return SHAPES.valueOf(name.toUpperCase()).getInstance();
    }


    enum SHAPES {
        CIRCLE{
            public Circle getInstance(){
                return new Circle();
            }
        }, SQUARE{
            public Square getInstance(){
                return new Square();
            }
        }, TRIANGLE{
            public Triangle getInstance(){
                return new Triangle();
            }
        };
        public abstract Shape getInstance();
    }
}
