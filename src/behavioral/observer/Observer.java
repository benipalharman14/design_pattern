package behavioral.observer;

/**
 * if there is change in object at certain period of time and there are entities
 * which want to listen to this change
 * 1- many dependencies
 * it is called pub-sub pattern as well
 * It is for smaller User based and if large, we have to design the system to handle it.
 * Subject changes something and it will notify all the observers as it has list of Observers
 * Example notify me, instagram post
 */
public interface Observer {

    void update(String news);

}
