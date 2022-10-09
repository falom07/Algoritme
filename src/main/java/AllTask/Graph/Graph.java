package AllTask.Graph;

public class Graph {
    private int maxN = 10;
    private int[][] mas;// матириця зміжності де 1 буде казати є періхід далі а 0 ні немає
    Vertex [] listVertex;// список вершин
    private int curN;//кількість вершин
    private MyStack stack = new MyStack();

    public Graph() {
        listVertex = new Vertex[maxN];
        mas = new int[maxN][maxN];
        curN = 0;
    }
    public void addVertex(char name){
        listVertex[curN++] = new Vertex(name);
    }
    public void addEdge(int start,int end){
        mas[start][end] = 1;
        mas[end][start] = 1;
    }
    public int check(int v){ // возращает не посищеную вершину
        for(int i = 0;i < curN;++i){
            if(mas[v][i] == 1 && listVertex[i].isVisited == false){
                return i;
            }
        }
        return -1;
    }
    public void passInDeep(int index){
        System.out.println(listVertex[index].name);//имя на консоль
        listVertex[index].isVisited = true;
        stack.push(index);

        while (!stack.isEmpty()){
            int neigh = check(stack.peek());

            if (neigh == -1){
                neigh = stack.pop();
            } else {
                System.out.println(listVertex[neigh].name);
                listVertex[neigh].isVisited = true;
                stack.push(neigh);
            }
        }
        for(int i = 0;i < curN;i++){
            listVertex[i].isVisited = false;
        }
    }
}
