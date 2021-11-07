package Software;

public class Announcement {

	
	//Variables
	private String description;
	private String videoImageUrl;
	
	//Constructors
	public Announcement() {
		this.setDescription("Yeah");
		this.setVideoImageUrl("http.com");
	}

	//Getter for Description
	public String getDescription() {
		return description;
	}

	//Setter for description
	public void setDescription(String description) {
		this.description = description;
	}

	//Getter for vieoImageUrl
	public String getVideoImageUrl() {
		return videoImageUrl;
	}

	//Setter for video image Url
	public void setVideoImageUrl(String videoImageUrl) {
		this.videoImageUrl = videoImageUrl;
	}
	
	//Add Descriptions
	public void addDescription(String s) {
		
	}
	
}
