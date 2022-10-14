package AllTask.SevenTasks;

import java.util.ArrayList;
import java.util.List;

public class Path {
    private int distance;
    private List<Integer> parentRoad;

    public Path(int distance) {
        this.distance = distance;
        this.parentRoad = new ArrayList<>();
    }

    public int getDistance() {
        return distance;
    }

    public List<Integer> getParentRoad() {
        return parentRoad;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setParentRoad(List<Integer> parentRoad) {
        this.parentRoad = parentRoad;
    }
}
