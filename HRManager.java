package Assignment1_10_24;

public class HRManager extends Employee {
	
	public HRManager(String name, int age, double salary) {
        super(name, age, salary);  
    }

    @Override
    public void work() {
        System.out.println(name + " is an HR Manager Employee.");
    }

    public void addEmployee() {
        System.out.println(name + " is adding a new employee.");
    }

}
