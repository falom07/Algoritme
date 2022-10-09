package AllTask.SecondTaskDepth;

import java.util.ArrayList;

public class Queue<T>  {
    ArrayList<T> list = new ArrayList<>();

    public void add(T object) {
        list.add(object);
    }
    public T remove() {
        return list.remove(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
