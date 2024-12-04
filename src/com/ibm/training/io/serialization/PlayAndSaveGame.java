package com.ibm.training.io.serialization;

public class PlayAndSaveGame {

	public static void main(String[] args) {
		Game g = new Game();
		
		g.play();
		
		System.out.println("Finished playing... now about to save");
		System.out.println(g.info);
		g.save();

	}

}
