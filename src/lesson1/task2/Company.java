package lesson1.task2;

import java.util.Arrays;

public class Company {
    private String companyname;
    private Departments[] departments;
    private Workers[] workers;

    public Company() {
    }

    public Company(String companyname, Departments[] departments, Workers[] workers) {
        this.companyname = companyname;
        this.departments = departments;
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyname='" + companyname + '\'' +
                ", departments=" + Arrays.toString(departments) +
                ", workers=" + Arrays.toString(workers) +
                '}';
    }
}
