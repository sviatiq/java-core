package lesson3.computers;

public class PC extends Computer{
    private String graphicCard;

    public PC() {
    }

    public PC(String model, String graphicCard) {
        super(model);
        this.graphicCard = graphicCard;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    @Override
    public String toString() {
        return "PC{" +
                "graphicCard='" + graphicCard + '\'' +
                '}';
    }
}
