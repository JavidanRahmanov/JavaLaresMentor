package MentorTasks.lesson12;

public class Employee {
    private int employeeId;
    private String employeeName;
    private  int salary;
    private static int totalSalary;
    private static int totalEmployees;

    public Employee(int employeeId, String employeeName, int salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        totalEmployees++;
        totalSalary += salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getTotalSalary() {
        return totalSalary;
    }

    public static void setTotalSalary(int totalSalary) {
        Employee.totalSalary = totalSalary;
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static void setTotalEmployees(int totalEmployees) {
        Employee.totalEmployees = totalEmployees;
    }
}
