package behavioral.iterator;

public class MyList implements Iterator<Integer>{

    private int[] items;
    private int lastAvailableIndex;
    private int i;

    @Override
    public boolean hasNext() {
        return i < lastAvailableIndex;
    }

    @Override
    public Integer next() {
        if(hasNext()){
            i++;
            return items[i];
        }
        return null;
    }

}
