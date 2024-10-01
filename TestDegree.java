/*
4. Create a class 'Degree' having a method 'getDegree' that prints"I got a degree". It has two subclasses namely 
'Undergraduate' and'Postgraduate'each having a method with the same name that prints"I am an Undergraduate" and 
"I am a Postgraduate" respectively.Call the method by creating an object of each of the three classes.
 */

package Assignment1_10_24;

public class TestDegree {

	public static void main(String[] args) {
		
		Degree degree = new Degree();
        degree.getDegree();
        
        Undergraduate ug = new Undergraduate();
        ug.getDegree(); 
        
        Postgraduate pg = new Postgraduate();
        pg.getDegree(); 
	}

}
