package com.ibm.training.basics;

public class ChemicalApp {

	public static void main(String[] args) {
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		ChemicalElement ga = new ChemicalElement(31, "Gallium", "Ga");
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		
		printDetails(h);
		printDetails(o);
		printDetails(k);
		printDetails(ga);
		
		//immutable objects
	}
	
	public static void printDetails(ChemicalElement c) {
		//c.atomicNumber = -1;
		
		System.out.println("_______________________________________");
		System.out.println("Element name: "+c.getName()+", symbol: "+c.getSymbol()+", atomicNumber: "+c.getAtomicNumber());
		System.out.println("Is it a metal? "+c.isMetal());
		System.out.println("Is it a transition metal? "+c.isTransitionMetal());
		System.out.println("Is it an alkali metal? "+c.isAlkaliMetal());
	}

}
