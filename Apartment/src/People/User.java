package People;

import Software.Profile;

public class User {

	//Variables
	private String name;
	private Profile profile;
	private int iD;
	private boolean loggedIn;
	
	//Constructor
	public User() {
		this.setiD(452);
		this.setLoggedIn(true);
		this.setName("Paul");
		this.setProfile(null);
	}

	//Getter for name
	public String getName() {
		return name;
	}

	//Setter for name
	public void setName(String name) {
		this.name = name;
	}

	//Getter for profile
	public Profile getProfile() {
		return profile;
	}

	//Setter for Profile
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	//Getter for iD
	public int getiD() {
		return iD;
	}

	//Setter for iD
	public void setiD(int iD) {
		this.iD = iD;
	}

	//Getter for boolean isLoggedIn
	public boolean isLoggedIn() {
		return loggedIn;
	}

	//Setter for isLoggedIn 
	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
}
