package lesson2.computer;

public class Processor {
    private String processorType;
    private int coreNum;
    private double cpuFrequency;
    private ManufactureCountry manufacture;

    public Processor() {
    }

    public Processor(String processorType, int coreNum, double cpuFrequency, ManufactureCountry manufacture) {
        this.processorType = processorType;
        this.coreNum = coreNum;
        this.cpuFrequency = cpuFrequency;
        this.manufacture = manufacture;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public void setCoreNum(int coreNum) {
        this.coreNum = coreNum;
    }

    public double getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(double cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public ManufactureCountry getManufacture() {
        return manufacture;
    }

    public void setManufacture(ManufactureCountry manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "processorType='" + processorType + '\'' +
                ", coreNum=" + coreNum +
                ", cpuFrequency=" + cpuFrequency +
                ", manufacture=" + manufacture +
                '}';
    }
}
