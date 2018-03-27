package week08.payroll;

public final class HourlyEmployee extends Employee {
    private int hours;
    private double rate;

    public HourlyEmployee(String first, String last, int no, int h, double r) {
        super(first, last, no);
        hours = h;
        rate = r;
    }

    public double earnings() {
        if (hours <= 40) {
            return rate * hours;
        } else {
            return 40 * rate + (hours - 40) * rate * 1.5;
        }
    }

    public String toString() {
        return "hourly employee: " + super.toString()
                + "\nhourly wage: " + rate + " hours worked: " + hours;
    }
}

