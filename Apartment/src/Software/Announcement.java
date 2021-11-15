package Software;

public class Announcement {
	
	//Variables
		private String title;
		private String description;
		private String videoImageUrl;
		private String date;
		
		//Constructors
		public Announcement() {
			title = "NULL";
			description = "NULL";
			videoImageUrl = "NULL";
			date = "NULL";
		}

		//Getter for Description
		public String getDescription() {
			return this.description;
		}

		//Setter for description
		public void setDescription(String description) {
			this.description = description;
		}

		//Getter for vieoImageUrl
		public String getVideoImageUrl() {
			return this.videoImageUrl;
		}

		//Setter for video image Url
		public void setVideoImageUrl(String videoImageUrl) {
			this.videoImageUrl = videoImageUrl;
		}
		
		//Setter for date
		public void setDate(String s) {
			this.date = s;
		}
		
		//Getter for date
		public String getDate() {
			return this.date;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
}
