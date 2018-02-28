package week04.bankAccount.v12;


// This a generic class that can be used for any type of items.
// This is how Java's ArrayList is implemented.
// You can use it to store Student objects, Customer objects,
// Banana objects, Tiger objects, etc.
class FlexibleList<T> {
    T[] elements;
    int numElements;

    public FlexibleList() {
        elements = (T[])new Object[3];
        numElements = 0;
    }

    public void add(T item) {
        if (numElements == elements.length) {
            T[] newList = (T[])new Object[numElements * 2];
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

    public T get(int index) {
        return elements[index];
    }
}

