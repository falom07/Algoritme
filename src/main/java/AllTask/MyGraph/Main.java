package AllTask.MyGraph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('A');//1
        graph.addVertex('B');//2
        graph.addVertex('C');//3
        graph.addVertex('D');//4
        graph.addVertex('E');//5
        graph.addVertex('F');//6
        graph.addVertex('Q');//7
        graph.addVertex('1');//7
        graph.addVertex('2');//7
        graph.addVertex('3');//7

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.addEdge(2,3);
        graph.addEdge(0,7);
        graph.addEdge(7,8);
        graph.addEdge(8,9);

        graph.goInDeep(0);

    }
}
