package AlgoritmUniversity;

public class Graph20 {
    private boolean adjMatix[][];
    private int numVertix;

    public Graph20(int numVertix) {
        this.numVertix = numVertix;
        adjMatix = new boolean [numVertix][numVertix];
    }
    public void addA(int i,int j){
        adjMatix[i][j] = true;
        adjMatix[j][i] = true;
    }
    public void removeA(int i,int j){
        adjMatix[i][j] = false;
        adjMatix[j][i] = false;
    }
    public boolean isEdge (int i,int j){
        return adjMatix[i][j];
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertix; i++) {
            s.append(i + ": ");
            for (boolean j : adjMatix[i]) {
                s.append((j?1:0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
