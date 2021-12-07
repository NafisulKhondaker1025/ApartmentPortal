package GUI;

import javax.swing.*;

import Software.Profile;

import java.awt.*;
import java.awt.event.*;

public class EmployeeManageProfile extends JFrame {

	//Fields
	private Profile p;
	
	private JPanel logo;
	private JPanel details;
	private JPanel menu;
	
	private JButton back;
	
	private JTextArea info;
	
	private JButton username;
	private JButton password;
	private JButton email;
	private JButton phonenumber;
	
	public EmployeeManageProfile(Profile profile) {
		super("Manage Your Profile Info");
		p = profile;
		setSize(800, 500);
		
		setLayout(new GridBagLayout());
		
		logo = new JPanel();
		details = new JPanel();
		menu = new JPanel();
		
		info = new JTextArea(p.printProfileInfoGUI());
		info.setEditable(false);
		
		back = new JButton();
		username = new JButton();
		password = new JButton();
		email = new JButton();
		phonenumber = new JButton();
		
		ImageIcon img5 = new ImageIcon(new ImageIcon("assets/Object.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
		
		username.setText("Change Username");
		password.setText("Change Password");
		email.setText("Change Email Address");
		phonenumber.setText("Change Phone Number");
		info.setOpaque(false);
		
		JLabel goBack = new JLabel("Back");
		JLabel logoImg = new JLabel(img5);
		
		details.add(info);
		back.add(goBack);
		menu.add(back);
		logo.add(logoImg);
		
		
		
		GridBagConstraints c = new GridBagConstraints();
		c.weightx = 0.5;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(logo, c);
		c.gridx = 1;
		c.gridy = 0;
		add(details, c);
		c.gridx = 2;
		c.gridy = 0;
		add(menu, c);
		
		c.gridx = 0;
		c.gridy = 1;
		add(username, c);		
		c.gridx = 1;
		c.gridy = 1;
		add(password, c);
		c.gridx = 0;
		c.gridy = 2;
		add(email, c);
		c.gridx = 1;
		c.gridy = 2;
		add(phonenumber, c);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildGUI();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void buildGUI() {
		back.addActionListener(new Listener());
		username.addActionListener(new Listener());
		password.addActionListener(new Listener());
		email.addActionListener(new Listener());
		phonenumber.addActionListener(new Listener());
	}
	
	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			JButton source = (JButton)(e.getSource());
			
			if (source.equals(back)) {
				handleBack();
			}
			else if (source.equals(username)) {
				handleChangeUserName();
			}
			else if (source.equals(password)) {
				handleChangePassword();
			}
			else if (source.equals(email)) {
				handleChangeEmail();
			}
			else if (source.equals(phonenumber)) {
				handleChangePhone();
			}
		}
	}
	
	private void handleBack() {
		EmployeeWindow w2 = new EmployeeWindow(this.p);
		this.dispose();
	}
	
	private void handleChangeUserName() {
		JPanel parent = new JPanel();
		
		JTextField newInp = new JTextField(5);
		

		parent.add(new JLabel("Enter New Username:"));
		parent.add(newInp);
		
		parent.setLayout(new GridLayout(3, 3, 5, 5));
		
		int result = JOptionPane.showConfirmDialog(null, parent, "New Username", JOptionPane.OK_CANCEL_OPTION);
		
		if (result == JOptionPane.OK_OPTION) {
			if (newInp.getText().equals("")) {
				JOptionPane.showMessageDialog(null, 
						"Please fill out all the fields", 
						"Error, Fields left blank", 
						JOptionPane.ERROR_MESSAGE);
			}
			else if (p.detectConflict(newInp.getText())) {
				JOptionPane.showMessageDialog(null, 
						"Please enter a differnet username", 
						"Error, username already taken", 
						JOptionPane.ERROR_MESSAGE);
			}
			else {
				p.setUserName(newInp.getText());
				this.info.setText(p.printProfileInfoGUI());
				JOptionPane.showMessageDialog(null, 
						"Success your username has been updated", 
						"Success", 
						JOptionPane.PLAIN_MESSAGE);	
			}
		}
	}
	
	private void handleChangePassword() {
		JPanel parent = new JPanel();
		
		JTextField oldInp = new JTextField(5);
		JTextField newInp = new JTextField(5);
		
		parent.add(new JLabel("Enter Old Password:"));
		parent.add(oldInp);
		parent.add(new JLabel("Enter New Password:"));
		parent.add(newInp);
		
		parent.setLayout(new GridLayout(3, 3, 5, 5));
		
		int result = JOptionPane.showConfirmDialog(null, parent, "New Password", JOptionPane.OK_CANCEL_OPTION);
		
		if (result == JOptionPane.OK_OPTION) {
			if (newInp.getText().equals("") || oldInp.getText().equals("")) {
				JOptionPane.showMessageDialog(null, 
						"Please fill out all the fields", 
						"Error, Fields left blank", 
						JOptionPane.ERROR_MESSAGE);
			}
			else {
				if (oldInp.getText().equals(p.getPassword())) {
					p.setPassWord(newInp.getText());
					this.info.setText(p.printProfileInfoGUI());
					JOptionPane.showMessageDialog(null, 
							"Success your password has been updated", 
							"Success", 
							JOptionPane.PLAIN_MESSAGE);	
				}
				else {
					JOptionPane.showMessageDialog(null, 
							"Please enter the correct password", 
							"Error, Incorrect Password", 
							JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}
	
	private void handleChangeEmail() {
		JPanel parent = new JPanel();
		
		JTextField newInp = new JTextField(5);
		

		parent.add(new JLabel("Enter New Email:"));
		parent.add(newInp);
		
		parent.setLayout(new GridLayout(3, 3, 5, 5));
		
		int result = JOptionPane.showConfirmDialog(null, parent, "New Email", JOptionPane.OK_CANCEL_OPTION);
		
		if (result == JOptionPane.OK_OPTION) {
			if (newInp.getText().equals("")) {
				JOptionPane.showMessageDialog(null, 
						"Please fill out all the fields", 
						"Error, Fields left blank", 
						JOptionPane.ERROR_MESSAGE);
			}
			else {
				if(p.detectConflictEmail(newInp.getText())) {
					JOptionPane.showMessageDialog(null, 
							"Please enter a different email", 
							"Error, Email already associated with another profile.", 
							JOptionPane.ERROR_MESSAGE);
				}
				else {
					p.setEmail(newInp.getText());
					this.info.setText(p.printProfileInfoGUI());
					JOptionPane.showMessageDialog(null, 
							"Success your email has been updated", 
							"Success", 
							JOptionPane.PLAIN_MESSAGE);	
				}
			}
		}
	}
	
	private void handleChangePhone() {
		JPanel parent = new JPanel();
		
		JTextField newInp = new JTextField(5);
		

		parent.add(new JLabel("Enter Phone Number (XXX-XXX-XXXX):"));
		parent.add(newInp);
		
		parent.setLayout(new GridLayout(3, 3, 5, 5));
		
		int result = JOptionPane.showConfirmDialog(null, parent, "New Phone Number", JOptionPane.OK_CANCEL_OPTION);
		
		if (result == JOptionPane.OK_OPTION) {
			if (newInp.getText().equals("")) {
				JOptionPane.showMessageDialog(null, 
						"Please fill out all the fields", 
						"Error, Fields left blank", 
						JOptionPane.ERROR_MESSAGE);
			}
			else {

				p.setPhone(newInp.getText());
				this.info.setText(p.printProfileInfoGUI());
				JOptionPane.showMessageDialog(null, 
						"Success your phone number has been updated", 
						"Success", 
						JOptionPane.PLAIN_MESSAGE);	

			}
		}
	}
	
}
