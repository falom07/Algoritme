package AllTask.SecondTaskDepth;

import java.util.ArrayList;

public class Stack<T> {
    ArrayList <T> list = new ArrayList<>();

    public void push(T object) {
        list.add(0,object);
    }


    public T pop() {
        return list.remove(0);
    }


    public boolean isEmpty() {
        return list.isEmpty();
    }
    public void seeList(){
        System.out.println(list);
    }
}
