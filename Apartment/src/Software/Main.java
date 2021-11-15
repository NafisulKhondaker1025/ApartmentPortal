package Software;

import java.util.Scanner;

import Hardware.Apartment;
import Hardware.Building;
import Hardware.RegularUnit;
import Hardware.StudioUnit;
import People.CurrResident;
import People.Employee;

public class Main {

	public static void main(String[] args) {
		
		//Initialize Apartment
		Apartment a = new Apartment();
		
		//Initialize Buildings
		Building b1 = new Building();
		Building b2 = new Building();
		
		//Initialize Units
		RegularUnit u1 = new RegularUnit();
		RegularUnit u2 = new RegularUnit();
		RegularUnit u3 = new RegularUnit();
		RegularUnit u4 = new RegularUnit();
		RegularUnit u5 = new RegularUnit();
		StudioUnit u6 = new StudioUnit();
		StudioUnit u7 = new StudioUnit();
		StudioUnit u8 = new StudioUnit();
		StudioUnit u9 = new StudioUnit();
		StudioUnit u10 = new StudioUnit();
		
		//Initialize Residents
		CurrResident r1 = new CurrResident();
		CurrResident r2 = new CurrResident();
		CurrResident r3 = new CurrResident();
		CurrResident r4 = new CurrResident();
		CurrResident r5 = new CurrResident();
		
		//Initialize Employees
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		//Initialize Profiles
		Profile p1 = new Profile(); //Resident Profile
		Profile p2 = new Profile(); //Resident Profile
		Profile p3 = new Profile(); //Resident Profile
		Profile p4 = new Profile(); //Resident Profile
		Profile p5 = new Profile(); //Resident Profile
		Profile p6 = new Profile(); //Employee Profile
		Profile p7 = new Profile(); //Employee Profile
		
		//Initialize Rent
		Rent rent1 = new Rent(); //Studio Unit
		Rent rent2 = new Rent(); //Regular Unit 1bed x 1bath
		Rent rent3 = new Rent(); //Regular Unit 2bed x 2bath
		
		//Assign Attributes
		a.setName("Palm Shadows Apartments");
		a.setAddress("1815 E Speedway Blvd");
		a.addBuilding(b1);
		a.addBuilding(b2);
		a.addEmployee(e1);
		a.addEmployee(e2);
		
		b1.setiD(1);
		b1.setAddress("1815 E Speedway Blvd");
		b2.setiD(2);
		b2.setAddress("1817 E Helen St");
		
		u1.setNumber(101);
		u1.setRent(rent2);
		u1.setNumBeds(1);
		u1.setNumBaths(1);
		u1.setMaxOccupants(2);
		
		u2.setNumber(201);
		u2.setRent(rent2);
		u2.setNumBeds(1);
		u2.setNumBaths(1);
		u2.setMaxOccupants(2);
		
		u3.setNumber(102);
		u3.setRent(rent3);
		u3.setNumBeds(2);
		u3.setNumBaths(2);
		u3.setMaxOccupants(3);
		
		u4.setNumber(202);
		u4.setRent(rent2);
		u4.setNumBeds(1);
		u4.setNumBaths(1);
		u4.setMaxOccupants(2);
		
		u5.setNumber(103);
		u5.setRent(rent3);
		u5.setNumBeds(2);
		u5.setNumBaths(2);
		u5.setMaxOccupants(3);
		
		u6.setNumber(203);
		u6.setRent(rent1);
		
		u7.setNumber(104);
		u7.setRent(rent1);
		
		u8.setNumber(204);
		u8.setRent(rent1);
		
		u9.setNumber(105);
		u9.setRent(rent1);
		
		u10.setNumber(205);
		u10.setRent(rent1);
		
		b1.addUnit(u1);
		b1.addUnit(u3);
		b1.addUnit(u5);
		b1.addUnit(u7);
		b1.addUnit(u9);
		
		b2.addUnit(u2);
		b2.addUnit(u4);
		b2.addUnit(u6);
		b2.addUnit(u8);
		b2.addUnit(u10);
		
		r1.setName("Adrian Peterson");
		r1.setiD(1001);
		u1.addCurrResident(r1);
		
		r2.setName("Kyler Murray");
		r2.setiD(1002);
		u1.addCurrResident(r2);
		
		r3.setName("Saquon Barkley");
		r3.setiD(1003);
		u6.addCurrResident(r3);
		
		r4.setName("Tom Brady");
		r4.setiD(1004);
		u3.addCurrResident(r4);
		
		r5.setName("Jonathan Taylor");
		r5.setiD(1005);
		u8.addCurrResident(r5);
		
		e1.setName("Kevin Durant");
		e1.setiD(2001);
		
		e2.setName("Giannis Antetokounmpo");
		e2.setiD(2002);
		
		p1.setProfileType(r1);
		p1.setUserName("apeterson");
		p1.setPassWord("0001");
		p1.setEmail("apeterson@gmail.com");
		p1.setApartment(a);
		p1.setPhone("909-805-2001");
		
		p2.setProfileType(r2);
		p2.setUserName("kmurray");
		p2.setPassWord("0002");
		p2.setEmail("kmurray@gmail.com");
		p2.setApartment(a);
		p2.setPhone("909-805-2002");
		
		p3.setProfileType(r3);
		p3.setUserName("sbarkley");
		p3.setPassWord("0003");
		p3.setEmail("sbarkley@gmail.com");
		p3.setApartment(a);
		p3.setPhone("909-805-2003");
		
		p4.setProfileType(r4);
		p4.setUserName("tbrady");
		p4.setPassWord("0004");
		p4.setEmail("tbrady@gmail.com");
		p4.setApartment(a);
		p4.setPhone("909-805-2004");
		
		p5.setProfileType(r5);
		p5.setUserName("jtaylor");
		p5.setPassWord("0005");
		p5.setEmail("jtaylor@gmail.com");
		p5.setApartment(a);
		p5.setPhone("909-805-2005");
		
		p6.setProfileType(e1);
		p6.setUserName("kdurant");
		p6.setPassWord("0006");
		p6.setEmail("kdurant@gmail.com");
		p6.setApartment(a);
		p6.setPhone("909-805-2006");
		
		p7.setProfileType(e2);
		p7.setUserName("gantetokounmpo");
		p7.setPassWord("0007");
		p7.setEmail("gantetokounmpo@gmail.com");
		p7.setApartment(a);
		p7.setPhone("909-805-2007");
		
		rent1.setMonthlyRent(750.00);
		rent1.setWaterBill(20.00);
		rent1.setDisposalBill(15.00);
		rent1.setLateFine(50.00);
		
		rent2.setMonthlyRent(900.00);
		rent2.setWaterBill(30.00);
		rent2.setDisposalBill(15.00);
		rent2.setLateFine(50.00);
		
		rent3.setMonthlyRent(1100.00);
		rent3.setWaterBill(40.00);
		rent3.setDisposalBill(15.00);
		rent3.setLateFine(50.00);
		
		Scanner userInput = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter 1 for Current Resident\nEnter 2 for Potential Resident\nEnter 3 for Employee\nEnter 0 to Quit");
			int userTypeChoice = userInput.nextInt();
			
			if (userTypeChoice == 1) {
				System.out.println("Enter Username:");
				String username = userInput.nextLine();
				System.out.println("Enter Password:");
				String password = userInput.nextLine();
				Profile profile = checkCredentials(username, password, a);
				if (profile != null) {
					System.out.println("Welcome " + profile.getResident().getName() + "\n");
					while (profile != null) {
						System.out.println("Enter 1 to Manage Profile\nEnter 2 to put in a Maintenance Order\nEnter 3 to make a Payment\nEnter 0 to Logout");
						int userChoice = userInput.nextInt();
						
						if (userChoice == 1) {
							manageResidentProfile(profile);
						}
						
						else if (userChoice == 2) {
							
						}
						
						else if (userChoice == 3) {
							
						}
						
						else if (userChoice == 0) {
							profile = null;
						}
						
						else {
							System.out.println("Invalid input!\n");
						}
					}
				}
				else {
					System.out.println("Invalid Credentials!\n");
				}
			}
			
			else if (userTypeChoice == 2) {
				
			}
			
			else if (userTypeChoice == 3) {
				
			}
			
			else if (userTypeChoice == 0) {
				userInput.close();
				return;
			}
			
			else {
				System.out.println("Invalid input!\n");
			}
		}
	}
	
	public static Profile checkCredentials(String user, String pass, Apartment a) {
		for (Profile p : a.getProfileList()) {
			if (p.getUserName().equals(user)) {
				if (p.getPassword().equals(pass)) {
					return p;
				}
			}
		}
		return null;
	}
	
	public static void manageResidentProfile(Profile p) {
		Scanner userInput = new Scanner(System.in);
		String s;
		int i;
		while (true) {
			p.printProfileInfo();
			System.out.println("Enter 1 to change Username\nEnter 2 to change Password\nEnter 3 to change Email\nEnter 4 to change Phone Number\nEnter 5 to change Bank Card\nEnter 6 to change Bank Account\nEnter 0 to go back");
			int userChoice = userInput.nextInt();
			
			if (userChoice == 1) {
				System.out.println("Enter New Username: ");
				s = userInput.nextLine();
				p.setUserName(s);
			}
			
			else if (userChoice == 2) {
				System.out.println("Enter New Password: ");
				s = userInput.nextLine();
				p.setPassWord(s);
			}
			
			else if (userChoice == 3) {
				System.out.println("Enter New Email: ");
				s = userInput.nextLine();
				p.setEmail(s);
			}
			else if (userChoice == 4) {
				System.out.println("Enter New Phone Number: ");
				s = userInput.nextLine();
				p.setPhone(s);
			}
			
			else if (userChoice == 5) {
				System.out.println("Enter New Bank Card Number: ");
				i = userInput.nextInt();
				p.getResident().getBankcard().setCardNumber(i);
				System.out.println("Enter New Bank Card Expiry Date: ");
				s = userInput.nextLine();
				p.getResident().getBankcard().setExpiryDate(s);
				System.out.println("Enter New Bank Card CVV: ");
				i = userInput.nextInt();
				p.getResident().getBankcard().setCvv(i);
			}
			
			else if (userChoice == 6) {
				System.out.println("Enter New Account Number: ");
				i = userInput.nextInt();
				p.getResident().getBankaccount().getAccountNumber();
				System.out.println("Enter New Routing Number: ");
				i = userInput.nextInt();
				p.getResident().getBankaccount().getRoutingNumber();
			}
			
			else if (userChoice == 0) {
				userInput.close();
				return;
			}
			else {
				System.out.println("Invalid Input!\n");
			}
		}
	}
	
	public void addMaintenanceOrder(Profile p) {
		
	}
	
}
