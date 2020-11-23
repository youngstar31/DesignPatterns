package creational;

public class Singleton {


    private static volatile Singleton instance;

    //Volatile ensures that instance will remain a singleton through any changes inside JVM

    private Singleton(){
        System.out.println("Instance Created");


    }
    //Protects a reflection class create an instance of this

    public static  Singleton getInstance(){
        if (instance == null) {

            synchronized (Singleton.class) { //synchronizing the class means that if one thread is calling the getInstance the 2nd thread needs to wait
                //Double Checked Locking
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
