package Assignment1_10_24;

public class Person {
	
	protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void work() {
        System.out.println(name + " is a person.");
    }
}
