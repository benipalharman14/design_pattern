package creational.singleton;

public class SingletonSynchronized {

    private static SingletonSynchronized instance;

    private SingletonSynchronized(){

    }

    public static synchronized SingletonSynchronized getInstance(){
        System.out.println("SingletonWithLazyLoading");
        System.out.println("Cons:::It is adding overhead / bad performance once the object is created");
        System.out.println("------");
        if(instance == null){
            instance = new SingletonSynchronized();
        }
        return instance;
    }
}
