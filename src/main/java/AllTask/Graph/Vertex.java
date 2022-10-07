package AllTask.Graph;

public class Vertex {
    public char name;//имя вершынны
    public boolean isVisited;// чи був він відвіданий

    public Vertex(char name) {
        this.name = name;
        isVisited = false;
    }
}
