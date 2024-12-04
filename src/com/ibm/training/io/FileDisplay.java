package com.ibm.training.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplay {

	public static void main(String[] args) {
		String fileName = "";
		if(args.length > 0) {
			fileName = args[0];
		}else {
			System.out.println("Please specify file name.");
			System.exit(1);
		}
		
		try {
			BufferedReader in = new BufferedReader( new FileReader(fileName));
			String line = "";
			while((line = in.readLine()) != null) {
				System.out.println(line);
			}
			in.close();
		}catch (FileNotFoundException e) {
			System.out.println("File not found.");
			System.exit(2);
		}catch (IOException e) {
			System.out.println("IO Error.");
			System.exit(3);
		}

	}

}
