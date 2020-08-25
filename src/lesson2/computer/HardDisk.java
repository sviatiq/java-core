package lesson2.computer;

public class HardDisk {
    private String hardDiskModel;
    private DiskType discType;
    private int diskSpace;
    private ManufactureCountry manufactureCountry;

    public HardDisk() {
    }

    public HardDisk(String hardDiskModel, DiskType discType, int diskSpace, ManufactureCountry manufactureCountry) {
        this.hardDiskModel = hardDiskModel;
        this.discType = discType;
        this.diskSpace = diskSpace;
        this.manufactureCountry = manufactureCountry;
    }

    public String getHardDiskModel() {
        return hardDiskModel;
    }

    public void setHardDiskModel(String hardDiskModel) {
        this.hardDiskModel = hardDiskModel;
    }

    public DiskType getDiscType() {
        return discType;
    }

    public void setDiscType(DiskType discType) {
        this.discType = discType;
    }

    public int getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(int diskSpace) {
        this.diskSpace = diskSpace;
    }

    public ManufactureCountry getManufactureCountry() {
        return manufactureCountry;
    }

    public void setManufactureCountry(ManufactureCountry manufactureCountry) {
        this.manufactureCountry = manufactureCountry;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "hardDiskModel=" + hardDiskModel +
                ", discType=" + discType +
                ", diskSpace=" + diskSpace +
                ", manufactureCountry=" + manufactureCountry +
                '}';
    }
}
