package com.ibm.training.awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class NotepadApp extends WindowAdapter implements ActionListener {
	
	Frame frame = new Frame("Untitled - JNotepad");
	TextArea textArea = new TextArea();
	boolean contentModified = false;
	boolean haveFileName = false;
	String dir,file;
	
	public NotepadApp() {
		frame.setLocation(300, 300);
		frame.setSize(500, 400);
		
		MenuBar menuBar = new MenuBar();
		
		Menu fileMenu = new Menu("File");
		Menu editMenu = new Menu("Edit");
		
		fileMenu.add(new MenuItem("New"));
		fileMenu.add(new MenuItem("Open"));
		fileMenu.add(new MenuItem("Save"));
		fileMenu.addSeparator();
		fileMenu.add(new MenuItem("Exit"));
		
		editMenu.add(new MenuItem("Cut"));
		editMenu.add(new MenuItem("Copy"));
		editMenu.add(new MenuItem("Paste"));
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		frame.add(textArea);
		
		//events
		frame.addWindowListener(this);
		fileMenu.addActionListener(this);
		editMenu.addActionListener(this);
		textArea.addKeyListener(new EditDetector());
		
		frame.setMenuBar(menuBar);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new NotepadApp();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		switch(cmd) {
		case "Exit" :
			windowClosing(null);
			break;
		case "Open" : 
			handleOpen();
			break;
		case "Save" :
			handleSave();
			break;
		}
	}
	

	private void handleSave() {
		if(!haveFileName) {
			FileDialog fd = new FileDialog(frame, "Specify file to save", FileDialog.SAVE);
			fd.setVisible(true);
			dir = fd.getDirectory();
			file = fd.getFile();
		}
		
		try {
			FileWriter fw = new FileWriter(dir+file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(textArea.getText());
			bw.close();
			frame.setTitle(file + " - JNotepad");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void handleOpen() {
		FileDialog fd = new FileDialog(frame, "Select File to Open", FileDialog.LOAD);
		fd.setVisible(true);
		dir = fd.getDirectory();
		file = fd.getFile();
		
		try {
			String absPath = dir + file;
			FileReader fr = new FileReader(absPath);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			textArea.setText("");
			while((line = br.readLine()) != null) {
				textArea.append(line + "\n");
			}
			br.close();
			frame.setTitle(file + " - JNotepad");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	class EditDetector extends KeyAdapter{
		@Override
		public void keyTyped(KeyEvent e) {
			contentModified = true;
			if(! frame.getTitle().startsWith("*")) {
				frame.setTitle("*"+frame.getTitle());
			}
		}
	}
	
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Closing...");
		System.exit(0);
	}
	
	
}
