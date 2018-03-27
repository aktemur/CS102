package week08.company;

public class Company {
    public static void main(String[] args) {
        Payable[] payables = new Payable[2];
        payables[0] = new Invoice(10, 3.5);
        payables[1] = new SalariedEmployee("Mary", "Jane", 1234, 1000);

        double total = 0;
        for (Payable p : payables) {
            System.out.println(p);
            total += p.getPayableAmount();
        }
        System.out.println("Total = " + total);
    }
}

