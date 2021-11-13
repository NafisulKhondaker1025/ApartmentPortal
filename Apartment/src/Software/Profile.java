package Software;

import People.User;

public class Profile {

	//Variables
	private String userName;
	private String password;
	private String email;
	private int phone;
	private int profileType;
	private User user;
	
	//Constructor
	public Profile () {
		userName = "NULL";
		password = "NULL";
		email = "NULL";
		phone = 0;
		profileType = 0;
		user = new User();
	}

	//Getter for userName
	public String getUserName() {
		return this.userName;
	}

	//Setter for userName
	public void setUserName(String userName) {
		this.userName = userName;
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
		this.email = email;
	}

	//Getter for phone
	public int getPhone() {
		return this.phone;
	}

	//Setter for phone
	public void setPhone(int phone) {
		this.phone = phone;
	}

	//Getter for profileType
	public int getProfileType() {
		return this.profileType;
	}

	//Setter for profileType
	public void setProfileType(int profileType) {
		this.profileType = profileType;
	}

	//Getter for User
	public User getUser() {
		return this.user;
	}

	//Setter for User
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
