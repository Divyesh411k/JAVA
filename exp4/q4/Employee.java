package q4;

public class Employee extends Person {
    private double annualSalary;
    private int startYear;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, int startYear, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getStartYear() {
        return startYear;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        return Double.compare(other.annualSalary, annualSalary) == 0
                && startYear == other.startYear
                && nationalInsuranceNumber.equals(other.nationalInsuranceNumber)
                && getName().equals(other.getName());
    }

    @Override
    public String toString() {
        return "Employee: " + getName() +
                "\nAnnual Salary: $" + annualSalary +
                "\nStart Year: " + startYear +
                "\nNational Insurance Number: " + nationalInsuranceNumber;
    }

    public String getName() {
        return null;
    }
}
