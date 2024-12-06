package com.ibm.training.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.ibm.training.jdbc.Product;
import com.ibm.training.jdbc.ProductDAO;

public class SwingProductForm extends WindowAdapter implements ActionListener,ItemListener {
	
	JFrame frame = new JFrame("Swing Product App - v2.1");
	
	JLabel lblName = new JLabel("Name");
	JLabel lblPrice = new JLabel("Price");
	JLabel lblQoh = new JLabel("QoH");
	JLabel lblStatus = new JLabel("           ");
	
	JTextField txtName = new JTextField(20);
	JTextField txtPrice = new JTextField(20);
	JTextField txtQoh = new JTextField(20);
	
	JButton btnOk = new JButton("Save Data");
	JButton btnCancel = new JButton("Clear Form");
	
	JComboBox<String> cmbLookAndFeel = new JComboBox<>(new String[] {"Metal","Nimbus","Motif","Windows","Windows Classic"});
	
	public SwingProductForm() {
		frame.setLocation(300, 300);
		frame.setSize(300, 300);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(lblName); panel.add(txtName);
		panel.add(lblPrice); panel.add(txtPrice);
		panel.add(lblQoh); panel.add(txtQoh);
		panel.add(btnOk); panel.add(btnCancel);
		panel.add(lblStatus);
		panel.add(cmbLookAndFeel);
		
		frame.setContentPane(panel);
		
		
		//events
		frame.addWindowListener(this);
		btnOk.addActionListener(this);
		btnCancel.addActionListener(this);
		cmbLookAndFeel.addItemListener(this);
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new SwingProductForm();
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Ending....");
		System.exit(0);
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
			new Thread(new DBDataSaver(p)).start();
			
			//SwingUtilities.invokeLater(new DBDataSaver(p));
			
			/*
			 * ProductDAO dao = new ProductDAO(); dao.save(p); clearTextFields();
			 * lblStatus.setText("Saved!");
			 */
		
		}else if(srcOfEvent == btnCancel) {
			/*
			 * try { Thread.sleep(10000); } catch (InterruptedException e1) {
			 * e1.printStackTrace(); }
			 */
			
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
	
	
	class DBDataSaver implements Runnable{
		Product dataToBeSaved;

		public DBDataSaver(Product dataToBeSaved) {
			this.dataToBeSaved = dataToBeSaved;
		}
		
		@Override
		public void run() {
			System.out.println("Saving data in separate thread "+Thread.currentThread().getName());
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			ProductDAO dao = new ProductDAO();
			dao.save(dataToBeSaved);
			clearTextFields();
			lblStatus.setText("Saved!");
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		String selection = (String) e.getItem();
		
		try {
			switch(selection) {
			case "Metal" :
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
				break;
			case "Motif" :
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				break;
			case "Nimbus" :
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
				break;
			case "Windows" :
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
				break;
			case "Windows Classic" :
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
				break;
			}
			SwingUtilities.updateComponentTreeUI(frame);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
	}

}
