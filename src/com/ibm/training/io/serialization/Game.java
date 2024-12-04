package com.ibm.training.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Game {
	
	GameInfo info = new GameInfo();
	
	public void play() {
		System.out.println("Playing game....");
		info.points += 21;
		info.level++;
		info.avatar = "giga fighter";
		
	}



	public void save() {
		try {
			FileOutputStream fout = new FileOutputStream("D:/temp/Nov24/b4/game.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(info);
			oos.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}



	public void restore() {
		try {
			FileInputStream fin = new FileInputStream("D:/temp/Nov24/b4/game.ser");
			ObjectInputStream ois = new ObjectInputStream(fin);
			this.info = (GameInfo) ois.readObject();
			ois.close();
		}catch (Exception e) {
			e.printStackTrace();	
		}

	}
}
