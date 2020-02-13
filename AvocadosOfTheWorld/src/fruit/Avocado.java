/**
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */
package fruit;
/***
 * Model an Avocado at Meijer in the Produce Department
 * @author nicomp
 *
 */
public class Avocado extends Fruit {
	
	// Add a Copy Constructor. By definition, a Copy Constructor takes as a parameter ...
	//an object of the same type
	public Avocado(Avocado avocado) {
		super(avocado.getWeight(), avocado.getCost());		
		
	}
	public Avocado(int weight, float cost) {
		// 'super' means the base class
		super(weight, cost); //Pass the weiht and cost to the base class constructor
	}
	
}
