package week08.payroll;

import java.util.ArrayList;

public class PayrollTest {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(new SalariedEmployee("Burcu", "Sarikaya", 123, 1000));
        employees.add(new HourlyEmployee("Batuhan", "Yapanoglu", 222, 2, 10));
        employees.add(new CommissionEmployee("Hazal", "Sahbaz", 333, 0.10, 3000));
        employees.add(new BasePlusCommissionEmployee("Deniz", "Iskender", 444, 0.20, 2500, 500));
        employees.add(new SalariedEmployee("Baris", "Manco", 555, 400));
        employees.add(new BasePlusCommissionEmployee("Burak", "Ataoglu", 888, 0.01, 5000, 600));

        printEmployees(employees);
        promoteBasePlusCommissionEmployees(employees);
        printEmployees(employees);
    }

    public static void printEmployees(ArrayList<Employee> emps) {
        for (Employee emp : emps) {
            System.out.println(emp);
            System.out.println("Earnings: " + emp.earnings() + "\n");
        }
    }

    public static void promoteBasePlusCommissionEmployees(ArrayList<Employee> emps) {
        for (Employee emp : emps) {
            if (emp instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee bemp = (BasePlusCommissionEmployee) emp;
                //bemp.baseSalary = bemp.baseSalary * 1.10;
                bemp.setBaseSalary(bemp.getBaseSalary() * 1.10);
            }
        }
    }
}
