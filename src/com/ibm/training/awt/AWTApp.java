package com.ibm.training.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTApp extends WindowAdapter implements ActionListener {
	
	Frame frame = new Frame("AWT App v1.0.0");
	Label lblName = new Label("Name");
	TextField txtName = new TextField(20);
	Button btnOk = new Button("Click Me!");
	Label lblMsg = new Label("                ");
	
	public AWTApp() {
		frame.setLocation(300, 250);
		frame.setSize(300, 250);
				
		frame.setLayout(new FlowLayout());
		frame.add(lblName);
		frame.add(txtName);
		frame.add(btnOk);
		frame.add(lblMsg);
		
		//register the event handlers
		btnOk.addActionListener(this);
		frame.addWindowListener(this);
		txtName.addMouseListener(new DhinchakColorChanger());
		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new AWTApp();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String input = txtName.getText();
		lblMsg.setText(input);
		txtName.setText("");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Bye!");
		System.exit(0);
	}

	class DhinchakColorChanger extends MouseAdapter{
		@Override
		public void mouseEntered(MouseEvent e) {
			txtName.setBackground(Color.MAGENTA);
			txtName.setForeground(Color.GREEN);
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			txtName.setBackground(Color.WHITE);
			txtName.setForeground(Color.BLACK);
		}
	}
}


