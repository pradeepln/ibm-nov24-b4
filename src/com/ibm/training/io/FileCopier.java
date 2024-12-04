package com.ibm.training.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class FileCopier {

	public static void main(String[] args) {
		Instant startTime = Instant.now();
		String srcFile = "", destFile = "";
		if(args.length > 1) {
			srcFile = args[0];
			destFile = args[1];
		}else {
			System.out.println("Usage : java com.ibm.training.io.FileCopier <srcFile> <destFile>");
			System.exit(1);
		}
		
		try {
			BufferedInputStream in = new BufferedInputStream( new FileInputStream(srcFile) );
			BufferedOutputStream out = new BufferedOutputStream( new FileOutputStream(destFile) );
			
			int aByte = 0;
			while((aByte = in.read()) != -1) {
				out.write(aByte);
			}
			
			in.close();
			out.close();
			
			System.out.print("\t 1 file(s) copied.");
			Instant endTime = Instant.now();
			Duration timeTaken = Duration.between(startTime, endTime);
			System.out.println("Took " + timeTaken.getSeconds() + " seconds.");
		}catch (FileNotFoundException e) {
			System.out.println("Error : "+srcFile+" not found.");
			System.exit(2);
		}catch (IOException e) {
			System.out.println("I/O Error : "+e.getMessage());
			System.exit(3);
		}
		
	}

}
