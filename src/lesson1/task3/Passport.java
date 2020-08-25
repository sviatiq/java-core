package lesson1.task3;

public class Passport {
    private String passportSeria;
    private int passportNum;
    private String cityRegistration;

    public Passport() {
    }

    public Passport(String passportSeria, int passportNum, String cityRegistration) {
        this.passportSeria = passportSeria;
        this.passportNum = passportNum;
        this.cityRegistration = cityRegistration;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public int getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(int passportNum) {
        this.passportNum = passportNum;
    }

    public String getCityRegistration() {
        return cityRegistration;
    }

    public void setCityRegistration(String cityRegistration) {
        this.cityRegistration = cityRegistration;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportSeria='" + passportSeria + '\'' +
                ", passportNum=" + passportNum +
                ", cityRegistration='" + cityRegistration + '\'' +
                '}';
    }
}
