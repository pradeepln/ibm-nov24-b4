package com.ibm.training.io.serialization;

public class RestoreGame {

	public static void main(String[] args) {
		Game g = new Game();
		System.out.println("Before restoring\n"+g.info);
		
		g.restore();
		
		System.out.println("After restoring\n"+g.info);
	}

}
