package Software;

import Hardware.Apartment;
import People.CurrResident;
import People.Employee;

public class Profile {
	
	//Variables
		private String userName;
		private String password;
		private String email;
		private String phone;
		private int profileType;
		private CurrResident resident;
		private Employee employee;
		private Apartment apartment;
		
		//Constructor
		public Profile () {
			userName = "NULL";
			password = "NULL";
			email = "NULL";
			phone = "NULL";
			profileType = 0;
			resident = null;
			employee = null;
			apartment = new Apartment(); 
		}

		//Getter for userName
		public String getUserName() {
			return this.userName;
		}

		//Setter for userName
		public void setUserName(String userName) {
			if (this.detectConflict(userName)) {
				return;
			}
			else {
				this.userName = userName;
			}
		}
		
		public boolean detectConflict(String userName) {
			for (Profile p : this.apartment.getProfileList()) {
				if (userName.equals(p.getUserName())) {
					System.out.println("Username already taken.");
					return true;
				}
			}
			return false;
		}

		//Getter for password
		public String getPassword() {
			return this.password;
		}

		//Setter for password
		public void setPassWord(String password) {
			this.password = password;
		}
		
		//Getter for email
		public String getEmail() {
			return this.email;
		}

		//Setter for email
		public void setEmail(String email) {
			if (this.detectConflictEmail(email)) {
				return;
			}
			else {
				this.email = email;
			}
		}
		
		public boolean detectConflictEmail(String email) {
			for (Profile p : this.apartment.getProfileList()) {
				if (email.equals(p.getEmail())) {
					System.out.println("Email already associated with another profile.");
					return true;
				}
			}
			return false;
		}

		//Getter for phone
		public String getPhone() {
			return this.phone;
		}

		//Setter for phone
		public void setPhone(String phone) {
			this.phone = phone;
		}

		//Getter for profileType
		public int getProfileType() {
			return this.profileType;
		}

		//Setter for profileType
		public void setProfileType(CurrResident r) {
			this.profileType = 1;
			this.setResident(r);
			r.setProfile(this);
		}
		
		//Setter for profileType
		public void setProfileType(Employee e) {
			this.profileType = 2;
			this.setEmployee(e);
		}
		
		public Apartment getApartment() {
			return this.apartment;
		}

		public void setApartment(Apartment apartment) {
			this.apartment = apartment;
			apartment.addProfile(this);
		}
		
		private void setResident(CurrResident r) {
			this.resident = r;
		}
		
		public CurrResident getResident() {
			return this.resident;
		}
		
		private void setEmployee(Employee e) {
			this.employee = e;
		}
		
		public Employee getEmployee() {
			return this.employee;
		}
		
		public void printProfileInfo() {
			if (this.profileType == 1) {
				System.out.println("Username: " + this.userName + "\nPassword: " + this.password + "\nEmail: " + this.email + "\nPhone Number: " + this.phone + "\nBank Account: " + this.resident.getBankaccount().getAccountNumber() + "\nBank Card: " + this.resident.getBankcard().getCardNumber() + "\n");
			}
			else {
				System.out.println("Username: " + this.userName + "\nPassword: " + this.password + "\nEmail: " + this.email + "\nPhone Number: " + this.phone + "\n");
			}
		}
		
		public String printProfileInfoGUI() {
			String outp = new String();
			if (this.profileType == 1) {
				outp += "Username: " + this.userName + "\nPassword: " + this.password + "\nEmail: " + this.email + "\nPhone Number: " + this.phone + "\nBank Account: " + this.resident.getBankaccount().getAccountNumber() + "\nBank Card: " + this.resident.getBankcard().getCardNumber() + "\n";
			}
			else {
				outp += "Username: " + this.userName + "\nPassword: " + this.password + "\nEmail: " + this.email + "\nPhone Number: " + this.phone + "\n";
			}
			return outp;
		}
}
