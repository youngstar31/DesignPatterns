package creational;

public class SingletonDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {

            public void run() {
              Singleton obj = Singleton.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton obj2 = Singleton.getInstance();
            }
        });

        t1.start();
        t2.start();


    }
}
