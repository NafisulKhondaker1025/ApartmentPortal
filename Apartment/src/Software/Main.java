package Software;

import java.util.Scanner;

import GUI.EmployeeWindow;
import Hardware.Apartment;
import Hardware.Building;
import Hardware.RegularUnit;
import Hardware.StudioUnit;
import Hardware.Unit;
import People.CurrResident;
import People.Employee;
import People.PotResident;

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
		
		//Initialize Potential Resident
		PotResident pot1 = new PotResident();
		PotResident pot2 = new PotResident();
		
		//Initialize Appointments
		Appointment app1 = new Appointment();
		Appointment app2 = new Appointment();
		
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
		
		//Initialize Announcements
		Announcement ann1 = new Announcement();
		Announcement ann2 = new Announcement();
		
		//Assign Attributes
		a.setName("Palm Shadows Apartments");
		a.setAddress("1815 E Speedway Blvd");
		a.addBuilding(b1);
		a.addBuilding(b2);
		a.addEmployee(e1);
		a.addEmployee(e2);
		a.addAppointmentSchedule(101);
		a.addAppointmentSchedule(102);
		a.addAppointmentSchedule(103);
		a.addAppointmentSchedule(104);
		a.addAppointmentSchedule(301);
		a.addAppointmentSchedule(302);
		a.addAppointmentSchedule(303);
		a.addAppointmentSchedule(304);
		a.addAppointmentSchedule(401);
		a.addAppointmentSchedule(402);
		a.addAppointmentSchedule(403);
		a.addAppointmentSchedule(404);
		
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
		
		app1.setDateTime(104);
		app1.addDescription("Want to discuss rent prices of 1 bed units.");
		
		app2.setDateTime(301);
		app2.addDescription("Just wanted to say Hi");
		
		pot1.setName("Stephen Curry");
		pot1.setPhone("909-805-4004");
		pot1.setEmail("scurry@gmail.com");
		a.addPotResident(pot1);
		pot1.setAppointment(app1);
		
		pot2.setName("Lebron James");
		pot2.setPhone("909-805-4005");
		pot2.setEmail("lbj@gmail.com");
		a.addPotResident(pot2);
		pot2.setAppointment(app2);
		
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
		
		ann1.setDate("11/15/2021");
		ann1.setDescription("Dear residents, building 2 hot water will be down for the rest of the month. Sorry for the inconvenience.");
		a.addAnnouncement(ann1);
		
		ann2.setDate("11/18/2021");
		ann2.setDescription("Dear residents, Coldplay is coming to perform at our parking lot tomorrow. All residents get free access to this live performance so enjoy the show!!!");
		a.addAnnouncement(ann2);
		
		EmployeeWindow ew = new EmployeeWindow(a.getProfileList().get(5));
		
		Scanner userInput = new Scanner(System.in);
		Profile profile;
		int userTypeChoice;
		while (true) {
			System.out.println("Enter 1 for Current Resident\nEnter 2 for Employee\nEnter 3 for Potential Resident\nEnter 0 to Quit");
			userTypeChoice = userInput.nextInt();
			
			if (userTypeChoice == 1) {
				System.out.println("Enter Username:");
				userInput.nextLine();
				String username = userInput.nextLine();
				userInput.nextLine();
				System.out.println("Enter Password:");
				String password = userInput.nextLine();
				userInput.nextLine();
				profile = checkCredentials(username, password, a);
				if (profile != null) {
					profile.getResident().setLoggedIn(true);
					System.out.println("Welcome " + profile.getResident().getName() + "\n");
					profile.getApartment().printAnnouncementList();
					while (profile != null) {
						System.out.println("Enter 1 to Manage Profile\nEnter 2 to put in a Maintenance Order\nEnter 3 to make a Payment\nEnter 0 to Logout");
						int userChoice = userInput.nextInt();
						
						if (userChoice == 1) {
							manageResidentProfile(profile, userInput);
						}
						
						else if (userChoice == 2) {
							addMaintenanceOrder(profile, userInput);
						}
						
						else if (userChoice == 3) {
							makePayment(profile, userInput);
						}
						
						else if (userChoice == 0) {
							profile.getResident().setLoggedIn(false);
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
				System.out.println("Enter Username:");
				userInput.nextLine();
				String username = userInput.nextLine();
				userInput.nextLine();
				System.out.println("Enter Password:");
				String password = userInput.nextLine();
				userInput.nextLine();
				profile = checkCredentials(username, password, a);
				if (profile != null) {
					int userChoice;
					profile.getEmployee().setLoggedIn(true);
					System.out.println("Welcome " + profile.getEmployee().getName() + "\n");
					while (profile != null) {
						System.out.println("Enter 1 to Manage Profile\nEnter 2 to make an Anouncement\nEnter 3 to add new Resident\nEnter 4 to view Apartment details\nEnter 0 to Logout");
						userChoice = userInput.nextInt();
						
						if (userChoice == 1) {
							manageEmployeeProfile(profile, userInput);
						}
						
						else if (userChoice == 2) {
							makeAnnouncement(profile, userInput);
						}
						
						else if (userChoice == 3) {
							addNewResident(profile, userInput);
						}
						
						else if (userChoice == 4) {
							viewApartmentDetails(profile, userInput);
						}
						
						else if (userChoice == 0) {
							profile.getEmployee().setLoggedIn(false);
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
			
			else if (userTypeChoice == 3) {
				makeAppointment(a, userInput);
			}
			
			else if (userTypeChoice == 0) {
				userInput.close();
				System.out.println("Closing Apartment Portal.....Good Bye");
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
	
	public static void manageResidentProfile(Profile p, Scanner userInput) {
		String s;
		int i;
		int userChoice;
		while (true) {
			p.printProfileInfo();
			System.out.println("Enter 1 to change Username\nEnter 2 to change Password\nEnter 3 to change Email\nEnter 4 to change Phone Number\nEnter 5 to change Bank Card\nEnter 6 to change Bank Account\nEnter 0 to go back");
			userChoice = userInput.nextInt();
			
			if (userChoice == 1) {
				userInput.nextLine();
				System.out.println("Enter New Username: ");
				s = userInput.nextLine();
				p.setUserName(s);
			}
			
			else if (userChoice == 2) {
				userInput.nextLine();
				System.out.println("Enter New Password: ");
				s = userInput.nextLine();
				p.setPassWord(s);
			}
			
			else if (userChoice == 3) {
				userInput.nextLine();
				System.out.println("Enter New Email: ");
				s = userInput.nextLine();
				p.setEmail(s);
			}
			else if (userChoice == 4) {
				userInput.nextLine();
				System.out.println("Enter New Phone Number: ");
				s = userInput.nextLine();
				p.setPhone(s);
			}
			
			else if (userChoice == 5) {
				userInput.nextLine();
				System.out.println("Enter New Bank Card Number (Must be 16 digit): ");
				i = userInput.nextInt();
				userInput.nextLine();
				p.getResident().getBankcard().setCardNumber(i);
				System.out.println("Enter New Bank Card Expiry Date: ");
				s = userInput.nextLine();
				userInput.nextLine();
				p.getResident().getBankcard().setExpiryDate(s);
				System.out.println("Enter New Bank Card CVV (Must be 3 digit): ");
				i = userInput.nextInt();
				p.getResident().getBankcard().setCvv(i);
			}
			
			else if (userChoice == 6) {
				System.out.println("Enter New Account Number (Must be 10 digits): ");
				i = userInput.nextInt();
				p.getResident().getBankaccount().setAccountNumber(i);
				System.out.println("Enter New Routing Number (Must be 9 digits): ");
				i = userInput.nextInt();
				p.getResident().getBankaccount().setAccountNumber(i);
			}
			
			else if (userChoice == 0) {
				return;
			}
			else {
				System.out.println("Invalid Input!\n");
			}
		}
	}
	
	public static void manageEmployeeProfile(Profile p, Scanner userInput) {
		String s;
		int userChoice;
		while (true) {
			p.printProfileInfo();
			System.out.println("Enter 1 to change Username\nEnter 2 to change Password\nEnter 3 to change Email\nEnter 4 to change Phone Number\nEnter 0 to go back");
			userChoice = userInput.nextInt();
			userInput.nextLine();
			
			if (userChoice == 1) {
				userInput.nextLine();
				System.out.println("Enter New Username: ");
				s = userInput.nextLine();
				p.setUserName(s);
			}
			
			else if (userChoice == 2) {
				userInput.nextLine();
				System.out.println("Enter New Password: ");
				s = userInput.nextLine();
				p.setPassWord(s);
			}
			
			else if (userChoice == 3) {
				userInput.nextLine();
				System.out.println("Enter New Email: ");
				s = userInput.nextLine();
				p.setEmail(s);
			}
			else if (userChoice == 4) {
				userInput.nextLine();
				System.out.println("Enter New Phone Number: ");
				s = userInput.nextLine();
				p.setPhone(s);
			}
			
			else if (userChoice == 0) {
				return;
			}
			else {
				System.out.println("Invalid Input!\n");
			}
		}
	}
	
	public static void addMaintenanceOrder(Profile p, Scanner userInput) {
		String s;
		int userChoice;
		while (true) {
			System.out.println("Enter 1 to display past Maintenance Orders\nEnter 2 to add new Maintenance Order\nEnter 0 to go back");
			userChoice = userInput.nextInt();
			userInput.nextLine();
			if (userChoice == 1) {
				if (p.getResident().getUnit().getMaintenanceList().size() == 0) {
					System.out.println("No past Maintenance orders to display.");
				}
				else {
					p.getResident().getUnit().printMaintenanceList();
				}
			}	
			else if (userChoice == 2) {
				System.out.println("Enter Maintenace Description: ");
				s = userInput.nextLine();
				Maintenance m = new Maintenance();
				m.setDescription(s);
				p.getResident().getUnit().addMaintenance(m);
			}
			
			else if (userChoice == 0) {
				return;
			}
			else {
				System.out.println("Invalid Input!\n");
			}
		}
	}
	
	public static void makePayment(Profile p, Scanner userInput) {
		double d;
		int userChoice;
		while (true) {
			System.out.println("Enter 1 to view Payment History\nEnter 2 for Card Payment\nEnter 3 for eCheck Payment\nEnter 0 to go back");
			userChoice = userInput.nextInt();
			userInput.nextLine();
			if (userChoice == 1) {
				if (p.getResident().getPaymentList().size() == 0) {
					System.out.println("No past payments to display.");
				}
				else {
					p.getResident().printPaymentHistory();
				}
			}
			else if (userChoice == 2) {
				if(p.getResident().getBankcard().getCardNumber() == 0) {
					System.out.println("You do not have a Credit/Debit card saved to your profile. Please do so and try again.");
				}
				else {
					Payment pay = new Payment();
					pay.setMethod(1);
					pay.setBankCard(p.getResident().getBankcard());
					System.out.println("Enter Payment amount: ");
					d = userInput.nextDouble();
					pay.setAmount(d);
					p.getResident().addPayment(pay);
					System.out.println("Payment Successful");
				}
			}	
			else if (userChoice == 3) {
				if(p.getResident().getBankaccount().getAccountNumber() == 0) {
					System.out.println("You do not have a Bank Account saved to your profile. Please do so and try again.");
				}
				else {
					Payment pay = new Payment();
					pay.setMethod(2);
					pay.setBankAccount(p.getResident().getBankaccount());
					System.out.println("Enter Payment amount: ");
					d = userInput.nextDouble();
					pay.setAmount(d);
					p.getResident().addPayment(pay);
					System.out.println("Payment Successful");
				}
			}
			
			else if (userChoice == 0) {
				return;
			}
			else {
				System.out.println("Invalid Input!\n");
			}
		}
	}
	
	public static void makeAnnouncement(Profile p, Scanner userInput) {
		String s;
		Announcement a = new Announcement();
		System.out.println("Enter date mm/dd/yyyy: ");
		userInput.nextLine();
		s = userInput.nextLine();
		userInput.nextLine();
		a.setDate(s);
		System.out.println("Enter Title: ");
		s = userInput.nextLine();
		userInput.nextLine();
		a.setTitle(s);
		System.out.println("Enter Description: ");
		s = userInput.nextLine();
		userInput.nextLine();
		a.setDescription(s);
		System.out.println("Enter video/image URL: ");
		s = userInput.nextLine();
		userInput.nextLine();
		a.setVideoImageUrl(s);
		p.getApartment().addAnnouncement(a);
		System.out.println("Announcement Posted.");
	}
	
	public static void addNewResident(Profile p, Scanner userInput) {
		String s;
		int i;
		int j;
		CurrResident r = new CurrResident();
		Profile prof = new Profile();
		userInput.nextLine();
		System.out.println("Enter the name of the new Resident: ");
		s = userInput.nextLine();
		r.setName(s);
		System.out.println("Enter the ID of the new Resident: ");
		i = userInput.nextInt();
		userInput.nextLine();
		r.setiD(i);
		System.out.println("Enter temporary username for the resident: ");
		s = userInput.nextLine();
		userInput.nextLine();
		prof.setUserName(s);
		System.out.println("Enter temporary password for the resident: ");
		s = userInput.nextLine();
		userInput.nextLine();
		prof.setPassWord(s);
		prof.setProfileType(r);
		System.out.println("Which buiding would you like to assign this Resident to? Enter the row number");
		p.getApartment().printBuildingList();
		i = userInput.nextInt();
		while(i < 1 || i > p.getApartment().getBuildingList().size()) {
			System.out.println("Invald Input! Please try again");
			System.out.println("Which buiding would you like to assign this Resident to? Enter the row number");
			p.getApartment().printBuildingList();
			i = userInput.nextInt();
		}
		System.out.println("Which unit would you like to assign this Resident to? Enter the row number");
		p.getApartment().getBuildingList().get(i-1).printUnits();
		j = userInput.nextInt();
		while(j < 1 || j > p.getApartment().getBuildingList().get(i-1).getUnitList().size()) {
			System.out.println("Invald Input! Please try again");
			System.out.println("Which unit would you like to assign this Resident to? Enter the row number");
			p.getApartment().getBuildingList().get(i-1).printUnits();
			j = userInput.nextInt();
		}
		if(p.getApartment().getBuildingList().get(i-1).getUnitList().get(j-1).isOccupied() == true) {
			System.out.println("This unit is fully occupied. Please start over.");
		}
		else {
			Unit u = p.getApartment().getBuildingList().get(i-1).getUnitList().get(j-1);
			r.getProfile().setApartment(p.getApartment());
			if (p.getApartment().getBuildingList().get(i-1).getUnitList().get(j-1) instanceof RegularUnit) {
				((RegularUnit)u).addCurrResident(r);
			}
			else {
				((StudioUnit)u).addCurrResident(r);
			}
			System.out.println(r.getName() + " has been added to Unit " + p.getApartment().getBuildingList().get(i-1).getUnitList().get(j-1).getNumber() + " of Building " + p.getApartment().getBuildingList().get(i-1).getiD());
		}
	}
	
	public static void viewApartmentDetails(Profile p, Scanner userInput) {
		int userChoice;
		while (true) {
			System.out.println("Enter 1 to view Residents\nEnter 2 to view Employee List\nEnter 3 to view Scheduled Appointments Enter\nEnter 4 to view Announcements\nEnter 0 to go back");
			userChoice = userInput.nextInt();
			if (userChoice == 1) {
				p.getApartment().printCurrResidentList();
			}
			else if (userChoice == 2) {
				p.getApartment().printEmployeeList();
			}
			else if (userChoice == 3) {
				p.getApartment().printScheduledAppointments();	
			}
			else if (userChoice == 4) {
				p.getApartment().printAnnouncementList();
			}
			else if (userChoice == 0) {
				return;
			}
			else {
				System.out.println("Invalid Input!\n");
			}
		}
	}
	
	public static void makeAppointment(Apartment a, Scanner userInput) {
		String s;
		int i;
		PotResident p = new PotResident();
		System.out.println("Thank you for considering " + a.getName() + ". You can create an appointment to talk to one of our representives or receive a tour.");
		System.out.println("Enter your name: ");
		userInput.nextLine();
		s = userInput.nextLine();
		userInput.nextLine();
		p.setName(s);
		System.out.println("Enter your phone number: ");
		s = userInput.nextLine();
		userInput.nextLine();
		p.setPhone(s);
		System.out.println("Enter your email: ");
		s = userInput.nextLine();
		userInput.nextLine();
		p.setEmail(s);
		a.addPotResident(p);
		System.out.println("Please select from the available appointment time slots. Enter the row number to select.");
		a.printAvailableAppointmentSchedule();
		i = userInput.nextInt();
		while(i < 1 || i > a.getAppointmentSchedule().size()) {
			System.out.println("Invalid Input!!!");
			System.out.println("Please select from the available appointment time slots. Enter the row number to select.");
			a.printAvailableAppointmentSchedule();
		}
		Appointment app = new Appointment();
		System.out.println("Please add a short description for you appointment.");
		s = userInput.nextLine();
		app.addDescription(s);
		userInput.nextLine();
		app.setDateTime(a.getAppointmentSchedule().get(i-1));
		p.setAppointment(app);
		System.out.println("Thank you for making an appointment. We look forward to meeting you soon!");
	}
	
}

