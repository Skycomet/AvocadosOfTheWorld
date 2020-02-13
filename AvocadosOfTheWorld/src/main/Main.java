/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * 
 */

package main; 
import bin.Bin;
import fruit.Avocado;
public class Main {

	public static void main(String[] args) {
 // Declare and instantiate a Fruit called avacajoe
		//Fruit avacajoe = new Fruit(); //Cannot instantiate an abstract class
									// Be able to explain why we have abstract classes
		Avocado avocajoe = new Avocado(6,(float).50);
	// Declare and instantiate a Bin object
		Bin box = new Bin(avocajoe);
		// Add 50 avocados to the bin.
		for (int i=0;i <50; i++) {
			 box.addAvocado(avocajoe);
		}
	}
}
