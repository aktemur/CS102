package week08.company;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String first, String last, int no, double s) {
        super(first, last, no);
        weeklySalary = s;
    }

    public double getPayableAmount() {
        return weeklySalary;
    }

    public String toString() {
        return "salaried employee: " + super.toString()
                + "\nweekly salary: " + weeklySalary;
    }

}
