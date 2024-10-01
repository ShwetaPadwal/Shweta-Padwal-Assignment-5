/*
 3.Create a class 'Student' with three data members which are name, age and address. The constructor of the class 
 assigns default values name as "unknown", age as '0' and address as "not available". It has two Members with the
 same name 'setInfo'. First method has two parameters for name and age and assigns the same whereas the second method
 takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
Hint-Use array of objects. 
 
 */

package Assignment1_10_24;

public class Student {

	private String name;
	private int age;
	private String address;

	public Student() {
		this.name = "unknown";
		this.age = 0;
		this.address = "not available";
	}

	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void printStudentInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
	}

	public static void main(String[] args) {
		Student[] students = new Student[10];

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}

		students[0].setInfo("Shweta", 23, "Pune");
		students[1].setInfo("Ankita", 24, "Pune");
		students[2].setInfo("Supriya",23, "Loni");
		students[3].setInfo("Tina", 23);
		students[4].setInfo("Mina", 22);
		students[5].setInfo( "Gita",21, "Pune");
		students[6].setInfo("Sita", 25);
		students[7].setInfo("Pratima", 23, "Nashik");
		students[8].setInfo("Meera", 23);
		students[9].setInfo("Kalpana", 22, "Mumbai");

		for (int i = 0; i < students.length; i++) {
			students[i].printStudentInfo();
		}
	}

}
