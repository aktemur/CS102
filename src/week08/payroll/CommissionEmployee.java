package week08.payroll;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String first, String last,
                              int no, double comm, double sales) {
        super(first, last, no);
        commissionRate = comm;
        grossSales = sales;
    }

    public double earnings() {
        return commissionRate * grossSales;
    }

    public String toString() {
        return "commission employee: " + super.toString()
                + "\ngross sales: " + grossSales
                + "\ncommission rate: " + commissionRate;
    }
}

