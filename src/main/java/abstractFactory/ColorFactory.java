package abstractFactory;


/**
 * Created by Sahil on 9/21/2017.
 */
public class ColorFactory implements AbstractFactory{

    public Color getColor(String name){
        return COLORS.valueOf(name.toUpperCase()).getInstance();
    }

    public Shape getShape(String shape) {
        return null;
    }

    enum COLORS{

        RED{
            public Color getInstance(){
                return new Blue();
            }
        },
        BLUE{
            public Color getInstance(){
                return new Red();
            }
        };

        public abstract Color getInstance();
    }
}
