package AllTask.SevenTasks;

public class Vertex {
    private String nameOfCountry;
    private boolean isVisite;

    public Vertex(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
        this.isVisite = false;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public void setVisite(boolean visite) {
        isVisite = visite;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public boolean isVisite() {
        return isVisite;
    }
}
