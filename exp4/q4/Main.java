package q4;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 60000, 2015, "NI12345");
        Employee emp2 = new Employee("Jane Smith", 55000, 2017, "NI54321");

        System.out.println("Employee 1 Details:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Annual Salary: $" + emp1.getAnnualSalary());
        System.out.println("Start Year: " + emp1.getStartYear());
        System.out.println("National Insurance Number: " + emp1.getNationalInsuranceNumber());

        System.out.println("\nAre Employee 1 and Employee 2 the same? " + emp1.equals(emp2));

        System.out.println("\nEmployee 1 Details:\n" + emp1);
        System.out.println("\nEmployee 2 Details:\n" + emp2);
    }
}
