package week04.bankAccount.v11;

class CustomerList {
    private Customer[] elements;
    private int numElements;

    public CustomerList() {
        this.elements = new Customer[3];
        this.numElements = 0;
    }

    public void add(Customer item) {
        if (numElements == elements.length) {
            Customer[] newList = new Customer[numElements * 2];
            for (int i = 0; i < numElements; i++) {
                newList[i] = elements[i];
            }
            elements = newList;
        }
        elements[numElements] = item;
        numElements++;
    }

    public int size() {
        return numElements;
    }

    public Customer get(int index) {
        return elements[index];
    }
}
