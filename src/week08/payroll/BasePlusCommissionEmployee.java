package week08.payroll;

public final class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last, int no,
                                      double comm, double sales, double base) {
        super(first, last, no, comm, sales);
        baseSalary = base;
    }

    public double earnings() {
        return super.earnings() + baseSalary;
    }

    public String toString() {
        return "base salaried " + super.toString()
                + "\nbase salary: " + baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }
}

