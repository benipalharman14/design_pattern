package behavioral.observer;

import java.util.*;

public class Subject {

    private int price;

    private List<Observer> observerList = new ArrayList<Observer>();

    public void registerObserver(Observer observer){
        observerList.add(observer);
    }

    public void deRegisterObserver(Observer observer){
        observerList.remove(observer);
    }

    public void updatePrice( int diff ){
        price += diff;
        if(diff > 5){
            for(Observer observer : observerList){
//                observer.notify(diff);
            }
        }

    }
}
