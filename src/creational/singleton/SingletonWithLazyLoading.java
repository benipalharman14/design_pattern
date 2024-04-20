package creational.singleton;

public class SingletonWithLazyLoading {

    private static SingletonWithLazyLoading instance;

    private SingletonWithLazyLoading(){

    }

    public static SingletonWithLazyLoading getInstance(){
        System.out.println("SingletonWithLazyLoading");
        System.out.println("Cons:::It is not thread safe");

        if(instance == null){
            instance = new SingletonWithLazyLoading();
        }
        System.out.println(instance);
        return instance;
    }

}

