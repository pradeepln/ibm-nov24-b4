package com.ibm.training.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.ibm.training.jdbc.Product;
import com.ibm.training.jdbc.ProductDAO;

public class ProductForm implements ActionListener{
	
	Frame frame = new Frame("Product App v1.0");
	
	Label lblName = new Label("Name");
	Label lblPrice = new Label("Price");
	Label lblQoh = new Label("QoH");
	Label lblStatus = new Label("               ");

	TextField txtName = new TextField(20);
	TextField txtPrice = new TextField(20);
	TextField txtQoh = new TextField(20);
	
	Button btnOk = new Button("Save Data");
	Button btnCancel = new Button("Clear Form");
	
	public ProductForm() {
		frame.setSize(250, 300);
		frame.setLocation(300, 250);
		
		frame.setLayout(new FlowLayout());
		
		frame.add(lblName); frame.add(txtName);
		frame.add(lblPrice); frame.add(txtPrice);
		frame.add(lblQoh); frame.add(txtQoh);
		frame.add(btnOk); frame.add(btnCancel);
		frame.add(lblStatus);
		
		//events
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);
		
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ProductForm();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object srcOfEvent = e.getSource();
		if(srcOfEvent == btnOk) {
			String name = txtName.getText();
			if(name == null || name.trim().equals("")) {
				lblStatus.setText("no name?");
				return;
			}
			
			float price = 0;
			try {
				price = Float.parseFloat( txtPrice.getText() );
			}catch (NumberFormatException ex) {
				txtPrice.setForeground(Color.RED);
				lblStatus.setText("WrongData");
				return;
			}
			
			int qoh = 0;
			try {
				qoh = Integer.parseInt( txtQoh.getText() );
			}catch (NumberFormatException ex) {
				txtQoh.setForeground(Color.RED);
				lblStatus.setText("WrongData");
				return;
			}
			
			Product p = new Product(name, price, qoh);
			ProductDAO dao = new ProductDAO();
			dao.save(p);
			clearTextFields();
			lblStatus.setText("Saved!");
		}else if(srcOfEvent == btnCancel) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
			clearTextFields();
		}
	}


	private void clearTextFields() {
		txtName.setText("");
		txtPrice.setText("");
		txtQoh.setText("");
		txtPrice.setForeground(Color.BLACK);
		txtQoh.setForeground(Color.BLACK);
	}
}
