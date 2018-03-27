package week08.payroll;

public final class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String first, String last, int no, double s) {
        super(first, last, no);
        weeklySalary = s;
    }

    public double earnings() {
        return weeklySalary;
    }

    public String toString() {
        return "salaried employee: " + super.toString()
                + "\nweekly salary: " + weeklySalary;
    }
}

