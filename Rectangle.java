/*
Create a class to print the area of a square and a rectangle.The class has two methods ‘printArea’ and 
‘printPerimeter’ with the same name but different number of parameters. The method for printing area of
Rectangle has two parameters which are length and breadth respectively while the other method for printing 
area of square has one parameter which is side of square.
 */

package Assignment1_10_24;

public class Rectangle {

	public void printArea(double length, double breadth) {
		double area = length * breadth;
		System.out.println("Area of Rectangle: " + area);
	}

	public void printPerimeter(double length, double breadth) {
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle: " + perimeter);
	}

	public void printArea(double side) {
		double area = side * side;
		System.out.println("Area of Square: " + area);
	}
	
	public void printPerimeter(double side) {
		double perimeter = 4 * side;
		System.out.println("Perimeter of Square: " + perimeter);
	}

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();

		rectangle.printArea(10, 20);
		rectangle.printPerimeter(10, 20);

		System.out.println("====================");

		rectangle.printArea(10);
		rectangle.printPerimeter(10);
	}
}
