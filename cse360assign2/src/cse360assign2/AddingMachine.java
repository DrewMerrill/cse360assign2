/**
 * @Author: Drew Merrill 1213000501
 * Class ID: RD7
 * Assignment: 2
 * File Description: This files creates an AddingMachine class with a 
 * 					 constructor and methods to add and subtract numbers
 */

package cse360assign2;

public class AddingMachine {
	
	private int total;
	private String toString = "0";
	
	/**
	 * Constructor for the AddingMachine class
	 */
	public AddingMachine() {
		total = 0; // not needed - included for clarity
	}
	
	/**
	 * Returns total
	 * 
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 * Add method adds the parameter to the total
	 * 
	 * @param value to be added
	 */
	public void add (int value) {
		total = total + value;
		toString = toString + " + " + value;
	}
	
	/**
	 * Subtract method subtracts the parameter from the total
	 * 
	 * @param value to be subtracted
	 */
	public void subtract (int value) {
		total = total - value;
		toString = toString + " - " + value;
	}
	
	/**
	 *  toString method returns the history of operations
	 */
	public String toString() {
		return toString;
	}
	
	/**
	 * clear method sets the total back to 0
	 */
	public void clear() {
		total = 0;
	}

}
