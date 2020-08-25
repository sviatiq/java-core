package lesson3.computers;

public class Workstation {
    private int cost;

    public Workstation() {
    }

    public Workstation(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "cost=" + cost +
                '}';
    }
}
