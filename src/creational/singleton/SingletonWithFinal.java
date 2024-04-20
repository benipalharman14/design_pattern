package creational.singleton;

public class SingletonWithFinal {

    private static final SingletonWithFinal instance = new SingletonWithFinal();

    private SingletonWithFinal(){

    }

    public static SingletonWithFinal getInstance() {
        System.out.println("SingletonWithFinal");
        System.out.println("Cons:::This class creates an object even without needing it");
        System.out.println(instance);
        return instance;

    }
}

