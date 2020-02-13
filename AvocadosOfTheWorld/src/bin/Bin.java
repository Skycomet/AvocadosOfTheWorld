package bin;
import fruit.Avocado;
import java.util.ArrayList;
/***
 * The thing at Meijer that holds produce for sale
 * @author knuthmn
 *
 */

public class Bin {
	// Add the Avocado property
	private Avocado avocado;
	private ArrayList<Avocado> avocados;
	// Add a constructor that accepts as a parameter an Avocado object
	public Bin(Avocado avocado) {
		this.avocado = avocado; //Store the value of the parameter in the object property
								// This only copies the reference
		this.avocado = new Avocado(avocado); //Invoke the copy constructor in Avocado
											//Makes a new copy of the object
		avocados = new ArrayList<Avocado>();
		
	}
	public void addAvocado(Avocado avocado) {
		// Put the avocado in the arraylist. Use avocado copy constructor
		avocados.add(new Avocado(avocado));
	}
	//Add a toString method
	public String toString() {return avocado.toString();}
	
}
