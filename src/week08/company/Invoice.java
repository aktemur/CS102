package week08.company;

public class Invoice implements Payable {
    private int quantity;
    private double pricePerItem;

    public Invoice(int q, double p) {
        quantity = q;
        pricePerItem = p;
    }

    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public String toString() {
        return super.toString() + " Quantity = " + quantity
                + " price per item = " + pricePerItem
                + " total price  = " + getPayableAmount();
    }
}

