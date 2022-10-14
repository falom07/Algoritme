package AllTask.SevenTasks;

import AllTask.SevenTask.Vertexs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private int size = 24;
    private int [][] relationMatrix;
    private int currentVertax;
    private int currentDistance;
    private int areVisitedVertex;
    private int allVertex;
    private Vertex [] listOfVertex;
    private List<Path> shortesRoud;
    private final int INFINITY = 1000000;

    public Graph() {
        relationMatrix = new int [size][size];
        listOfVertex = new Vertex [size];
        currentVertax = 0;
        areVisitedVertex = 0;
        shortesRoud = new ArrayList<>();
        for(int i = 0;i < size;++i){
            for(int j = 0;j <size;++j){
                relationMatrix[i][j] = INFINITY;
            }
        }
    }
    public void addVertex(String nameOfVertex){
        listOfVertex[allVertex++] = new Vertex (nameOfVertex);
    }
    public void addEdge(int from,int to,int km){
        relationMatrix[from][to] = km;
    }
    public void path(){
        int startVertax = 0;
        listOfVertex[startVertax].setVisite(true);
        areVisitedVertex = 1;

        for(int i = 0;i < allVertex;++i){
            int startDistance = relationMatrix[startVertax][i];
            Path path = new Path(startDistance);
            path.getParentRoad().add(0);
            shortesRoud.add(path);
        }

        while(allVertex > areVisitedVertex){
            int minIndex = minIndex();
            int distance = shortesRoud.get(minIndex).getDistance();

            if(distance == INFINITY){
                System.out.println("Це місто напевно окупованне,бо дороги туди немає,але скоро воно буде відвойоване");
                break;
            } else {
            currentVertax = minIndex;
            currentDistance = shortesRoud.get(minIndex).getDistance();
            }

            ++areVisitedVertex;
            listOfVertex[currentVertax].setVisite(true);
            seeAroud();
        }
        writeAllRoud();
    }
    private void seeAroud(){
        int i = 1;
        while (i < allVertex){
            if(listOfVertex[i].isVisite()){
                ++i;
                continue;
            }
                int distanceChild = relationMatrix[currentVertax][i];
                int togetherDistance = distanceChild + currentDistance;
                int shoortDistance = shortesRoud.get(i).getDistance();

                if( shoortDistance > togetherDistance){
                    List<Integer> list = new ArrayList<>(shortesRoud.get(currentVertax).getParentRoad());
                    list.add(currentVertax);
                    shortesRoud.get(i).setParentRoad(list);
                    shortesRoud.get(i).setDistance(togetherDistance);
                }
                ++i;
            }

        }

    private int minIndex(){
        int minDistans = INFINITY;
        int index = 0;

        for(int i = 1;i < allVertex;++i){
            if(shortesRoud.get(i).getDistance() < minDistans && !listOfVertex[i].isVisite()){
                minDistans = shortesRoud.get(i).getDistance();
                index = i;
            }
        }
        return index;
    }
    private void writeAllRoud(){
        for (int i = 0; i < allVertex; i++) {
            System.out.print(listOfVertex[i].getNameOfCountry() + " = ");
            if (shortesRoud.get(i).getDistance() == INFINITY) {
                System.out.println("0");
            } else {
                String result = shortesRoud.get(i).getDistance() + " (";
                List<Integer> parents = shortesRoud.get(i).getParentRoad();
                for (int j = 0; j < parents.size(); j++) {
                    result += listOfVertex[parents.get(j)].getNameOfCountry() + " -> ";
                }
                System.out.println(result + listOfVertex[i].getNameOfCountry() + ")");
            }
        }
    }
}
