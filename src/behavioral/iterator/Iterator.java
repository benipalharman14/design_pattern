package behavioral.iterator;

/**
 *  This pattern is used when we need to build data structures.
 *  It is highly unlike we need this pattern
 *  The person who has implemented PriorityQueue<Integer> and needs a way to iterate over the heap
 *  Example Stack, Queue, LinkedList and List use iterator pattern to iterate over the elements
 *
 *  Client wants to access any element - we want to perform additional operation.
 *
 */
public interface Iterator<T> {

    boolean hasNext();

    T next();

}
