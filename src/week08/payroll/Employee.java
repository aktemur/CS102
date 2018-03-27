package week08.payroll;

public abstract class Employee {
    private String firstName, lastName;
    private int SSN;

    public Employee(String first, String last, int no) {
        firstName = first;
        lastName = last;
        SSN = no;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSSN() {
        return SSN;
    }

    public String toString() {
        return firstName + " " + lastName + "\n"
                + "social security number: " + SSN;
    }

    public abstract double earnings();
}



