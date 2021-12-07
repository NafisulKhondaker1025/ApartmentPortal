package GUI;

import javax.swing.*;

import Hardware.Building;
import Hardware.Unit;
import Software.Profile;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class EmployeeWindow extends JFrame {

	//Fields
	private Profile p;
	
	private JPanel logo;
	private JPanel greet;
	private JPanel menu;
	
	private JButton logout;
	
	private JButton prof;
	private JButton ann;
	private JButton res;
	private JButton apar;
	
	ImageIcon img1 = new ImageIcon(new ImageIcon("assets/ManageProfile.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
	ImageIcon img2 = new ImageIcon(new ImageIcon("assets/MakeAnnouncement.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
	ImageIcon img3 = new ImageIcon(new ImageIcon("assets/Resident.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
	ImageIcon img4 = new ImageIcon(new ImageIcon("assets/Apartment.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
	ImageIcon img5 = new ImageIcon(new ImageIcon("assets/Object.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
	
	public EmployeeWindow(Profile profile) {
		
		super("Home");
		p = profile;
		setSize(800, 500);
		
		setLayout(new GridBagLayout());
		
		logo = new JPanel();
		greet = new JPanel();
		menu = new JPanel();
		
		logout = new JButton();
		prof = new JButton();
		ann = new JButton();
		res = new JButton();
		apar = new JButton();
		
		JLabel logoImg = new JLabel(img5);
		JLabel greeting = new JLabel("Welcome " + p.getEmployee().getName());
		JLabel logOut = new JLabel("Logout");
		
		JLabel profImg = new JLabel(img1);
		JLabel annImg = new JLabel(img2);
		JLabel resImg = new JLabel(img3);
		JLabel aparImg = new JLabel(img4);
		
		logo.add(logoImg);
		greet.add(greeting);
		logout.add(logOut);
		menu.add(logout);
		
		prof.add(profImg);
		ann.add(annImg);
		res.add(resImg);
		apar.add(aparImg);
		
		GridBagConstraints c = new GridBagConstraints();
		c.weightx = 0.5;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		add(logo, c);
		c.gridx = 1;
		c.gridy = 0;
		add(greet, c);
		c.gridx = 2;
		c.gridy = 0;
		add(menu, c);
		
		c.gridx = 0;
		c.gridy = 1;
		add(prof, c);		
		c.gridx = 1;
		c.gridy = 1;
		add(ann, c);
		c.gridx = 0;
		c.gridy = 2;
		add(res, c);
		c.gridx = 1;
		c.gridy = 2;
		add(apar, c);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildGUI();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void buildGUI() {
		logout.addActionListener(new Listener());
		prof.addActionListener(new Listener());
		ann.addActionListener(new Listener());
		res.addActionListener(new Listener());
		apar.addActionListener(new Listener());
	}
	
	private class Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			JButton source = (JButton)(e.getSource());
			
			if (source.equals(logout)) {
				handleLogout();
			}
			else if (source.equals(prof)) {
				handleProf();
			}
			else if (source.equals(ann)) {
				
			}
			else if (source.equals(res)) {
				handleRes();
			}
			else if (source.equals(apar)) {
				
			}
		}
	}
	
	private void handleLogout() {
		
	}
	
	private void handleProf() {
		EmployeeManageProfile w1 = new EmployeeManageProfile(this.p);
		this.dispose();
	}
	
	private void handleAnn() {
		
	}
	
	private void handleRes() {
		JPanel parent = new JPanel();
		
		JTextField nameInp = new JTextField(5);
		JTextField idInp = new JTextField(5);
		JTextField user = new JTextField();
		JTextField pass = new JTextField(5);
		ArrayList<String> Buildings = new ArrayList<String>();
		for (Building b : this.p.getApartment().getBuildingList()) {
			Buildings.add(Integer.toString(b.getiD()));
		}
		JComboBox b1 = new JComboBox(Buildings.toArray());
		JComboBox u1 = new JComboBox();
		
		b1.addActionListener(event -> {
			int num = Integer.parseInt(Buildings.get(b1.getSelectedIndex()));
			Building b2 = p.getApartment().findBuilding(num);
			u1.removeAll();
			for (Unit u : b2.getUnitList()) {
				if(u.isOccupied() == false) {
					u1.addItem(Integer.toString(u.getNumber()));
				}
			}
		});
		
//		for (Unit u : b2.getUnitList()) {
//			if(u.isOccupied() == false) {
//				Units.add(Integer.toString(u.getNumber()));
//			}
//		}
//		JComboBox u1 = new JComboBox(Units.toArray());
		
		
		parent.add(new JLabel("Resident Name: "));
		parent.add(nameInp);
		parent.add(new JLabel("Resident ID: "));
		parent.add(idInp);
		parent.add(new JLabel("Temporary Username: "));
		parent.add(user);
		parent.add(new JLabel("Select Building: "));
		parent.add(b1);
		parent.add(new JLabel("Select Unit: "));
		parent.add(u1);
		
		parent.setLayout(new GridLayout(5, 5, 5, 5));
		
		int result = JOptionPane.showConfirmDialog(null, parent, "Add New Resident", JOptionPane.OK_CANCEL_OPTION);
	}
	
	private void handleApar() {
		
	}
}
