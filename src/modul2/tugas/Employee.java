package modul2.tugas;

public class Employee implements EmployeeInterface {
    private String employeeName; // employeeName
    private int employeeAge; //  employeeAge
    private double salary; // salary
    private String jobDescription; // jobDescription

    public Employee(String employeeName, int employeeAge, double salary, String jobDescription){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.salary = salary;
        this.jobDescription = jobDescription;
    }

    // printEmployeeInfo
    @Override
    public void printEmployeeInfo(){
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Age: " + employeeAge);
        System.out.println("salary: $" + salary);
        System.out.println("Job Description: " + jobDescription);
    }

    //calculateAnnualSalary
    @Override
    public double calculateAnnualSalary(){
        return salary * 12;
    }

    // applyRaise
    @Override
    public void applyRaise(double raisePercentage){
        salary += (salary * raisePercentage / 100);
    }

}