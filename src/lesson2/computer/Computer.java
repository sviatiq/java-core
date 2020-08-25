package lesson2.computer;

public class Computer implements Comparable<Computer>{
    private String model;
    private int year;
    private int memory;
    private int price;
    private HardDisk hardDisk;
    private Processor processor;

    public Computer() {
    }

    public Computer(String model, int year, int memory, int price, HardDisk hardDisk, Processor processor) {
        this.model = model;
        this.year = year;
        this.memory = memory;
        this.price = price;
        this.hardDisk = hardDisk;
        this.processor = processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", memory=" + memory +
                ", price=" + price +
                ", hardDisk=" + hardDisk +
                ", processor=" + processor +
                '}';
    }


    @Override
    public int compareTo(Computer o) {
        return getPrice()-o.getPrice();
    }
}
