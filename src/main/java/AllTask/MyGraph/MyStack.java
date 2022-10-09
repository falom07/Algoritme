package AllTask.MyGraph;

public class MyStack {
    private int[] massive;
    private int size = 10;
    private int currentElement;

    public MyStack() {
        massive = new int [size];
        currentElement = -1;
    }


    public void push(int index){
        massive[++currentElement] = index;
    }
    public void pop(){
        --currentElement;
    }
    public int peek(){
        return massive[currentElement];
    }
    public boolean isEmpty(){
        if(currentElement == -1){
            return true;
        }else{
            return false;
        }
    }
}
