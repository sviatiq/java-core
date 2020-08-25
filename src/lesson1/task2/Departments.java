package lesson1.task2;

public class Departments {
    private String departmentName;


    public Departments() {
    }

    public Departments(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }
}
