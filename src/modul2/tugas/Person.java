package modul2.tugas;

public class Person {
    protected String employeeName;
    protected int employeeAge;
    protected double salary;
    protected String jobDescription;

    public Person(String empName, int employeeAge, double Salary, String jobDescription) {
        employeeName = empName;
        this.employeeAge = employeeAge;
        salary = Salary;
        this.jobDescription = jobDescription;
    }
}
