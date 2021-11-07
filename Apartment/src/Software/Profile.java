package Software;

import People.User;

public class Profile {

	//Variables
	private String userName;
	private String passWord;
	private String email;
	private int phone;
	private int profileType;
	private User user;
	
	//Constructor
	public Profile () {
		this.setEmail("abc@gmail.com");
		this.setPassWord("abc");
		this.setPhone(12345678);
		this.setProfileType(4);
		this.setUserName("abcD");
	}

	//Getter for userName
	public String getUserName() {
		return userName;
	}

	//Setter for userName
	public void setUserName(String userName) {
		this.userName = userName;
	}

	//Getter for password
	public String getPassWord() {
		return passWord;
	}

	//Setter for password
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	//Getter for email
	public String getEmail() {
		return email;
	}

	//Setter for email
	public void setEmail(String email) {
		this.email = email;
	}

	//Getter for phone
	public int getPhone() {
		return phone;
	}

	//Setter for phone
	public void setPhone(int phone) {
		this.phone = phone;
	}

	//Getter for profileType
	public int getProfileType() {
		return profileType;
	}

	//Setter for profileType
	public void setProfileType(int profileType) {
		this.profileType = profileType;
	}

	//Getter for User
	public User getUser() {
		return user;
	}

	//Setter for User
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
