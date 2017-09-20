package singleton;

/**
 * Created by Sahil on 9/21/2017.
 */
public class SingletonPatternDemo {

    /*Method 1: Make a static instance */
    /*private static SingletonPatternDemo _instance = new SingletonPatternDemo();*/

    /*Method 2: Make a volatile instance object and initialize it in the synchronize block*/
    private volatile static SingletonPatternDemo _instance;

    private SingletonPatternDemo(){}

    public static SingletonPatternDemo getInstance(){
        if(null==_instance){        /*First check*/
            synchronized (SingletonPatternDemo.class){
                if(null==_instance) /*Second check*/
                    _instance = new SingletonPatternDemo();
            }
        }
        return _instance;
    }

}
