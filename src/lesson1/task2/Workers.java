package lesson1.task2;

public class Workers {
    private String workerName;
    private String workerSurname;
    private int workerExperience;
    private String position;

    public Workers() {
    }

    public Workers(String workerName, String workerSurname, int workerExperience, String position) {
        this.workerName = workerName;
        this.workerSurname = workerSurname;
        this.workerExperience = workerExperience;
        this.position = position;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerSurname() {
        return workerSurname;
    }

    public void setWorkerSurname(String workerSurname) {
        this.workerSurname = workerSurname;
    }

    public int getWorkerExperience() {
        return workerExperience;
    }

    public void setWorkerExperience(int workerExperience) {
        this.workerExperience = workerExperience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "workerName='" + workerName + '\'' +
                ", workerSurname='" + workerSurname + '\'' +
                ", workerExperience=" + workerExperience +
                ", position='" + position + '\'' +
                '}';
    }
}
