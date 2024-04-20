package creational.singleton;


public class Calling {
    public static void main(String[] args) {
        SingletonWithFinal singleton1 = SingletonWithFinal.getInstance();
        SingletonWithFinal singleton2 = SingletonWithFinal.getInstance();

        if(singleton1.equals(singleton2)){
            System.out.println(">>>SingletonWithFinal equals");
            System.out.println("-------------");
        }

//        Thread t1 = new Thread(new Runnable(){public void run(){SingletonWithFinal.getInstance();}});
//        Thread t2 = new Thread(new Runnable(){public void run(){SingletonWithFinal.getInstance();}});
//        t1.start();
//        t2.start();

//        Thread t1 = new Thread(SingletonWithLazyLoading::getInstance);
//        Thread t2 = new Thread(SingletonWithLazyLoading::getInstance);
//        t1.start();
//        t2.start();
//
//
//        SingletonWithLazyLoading.getInstance();
//        SingletonSynchronized.getInstance();

    }
}

