package com.ibm.training.io;

import java.io.File;
import java.util.Date;

public class FileDirListing {

	public static void main(String[] args) {
		
		String pathToList = ".";
		if(args.length > 0) {
			pathToList = args[0];
		}
		
		File dirToList = new File(pathToList);
		if(dirToList.exists() && dirToList.isDirectory()) {
			File[] contents = dirToList.listFiles();
			for(File aFileOrFolder : contents) {
				Date lastMod = new Date(aFileOrFolder.lastModified());
				System.out.print(lastMod + "\t");
				System.out.print((aFileOrFolder.isDirectory() ? "<DIR>" : "     " ) + "\t");
				System.out.print((aFileOrFolder.isFile() ? aFileOrFolder.length() : "    ") + "\t");
				System.out.println(aFileOrFolder.getName());
			}
		}else {
			System.out.println("The folder either doesn't exist or not a folder.");
		}
	}

}
