package Assignment1_10_24;

public class Employee extends Person {
	protected double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);  
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(name + " is an Employee.");
    }

    public double getSalary() {
        return salary;
    }
}

