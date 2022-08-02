package Main;

public class Staff {
    private String employeeCode;
    private String firstAndLastName;
    private int yearOfBirth;
    private float Salary;

    public Staff(String employeeCode, String firstAndLastName, int yearOfBirth, float salary) {
        this.employeeCode = employeeCode;
        this.firstAndLastName = firstAndLastName;
        this.yearOfBirth = yearOfBirth;
        Salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFirstAndLastName() {
        return firstAndLastName;
    }

    public void setFirstAndLastName(String firstAndLastName) {
        this.firstAndLastName = firstAndLastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }
}
