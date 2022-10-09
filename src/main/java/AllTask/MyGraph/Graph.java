package AllTask.MyGraph;

public class Graph {
    private final int size = 10;
    private MyStack stack = new MyStack();
    private int curVertex;
    private Vertex []listVertex;
    private int [][]matrix;

    public Graph() {
        listVertex = new Vertex[size];
        matrix = new int[size][size];
        curVertex = 0;
    }
    public void addVertex (char name){
        listVertex[curVertex++] = new Vertex(name);
    }
    public void addEdge(int start,int end){
        matrix [start][end] = 1;
        matrix [end][start] = 1;
    }
    public int check(int index){
        for(int i = 0;i < curVertex;++i){
            if(matrix [index][i] == 1 && !listVertex[i].isVisite){
                return i;
            }
        }
        return -1;
    }
    public void goInDeep(int index){
        System.out.println(listVertex[index].name);
        listVertex[index].isVisite = true;
        stack.push(index);

        while(!stack.isEmpty()){
            int fate = check(stack.peek());

            if(fate == -1){
                stack.pop();
            }else{
                System.out.println(listVertex[fate].name);
                listVertex[fate].isVisite = true;
                stack.push(fate);
            }
        }
        for(int i = 0;i < curVertex;++i){
            listVertex[i].isVisite = false;
        }
    }
}
