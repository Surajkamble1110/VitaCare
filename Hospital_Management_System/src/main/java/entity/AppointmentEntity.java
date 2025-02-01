package entity;

public class AppointmentEntity {

	
	private String userName;
	private String userEmail ;
	private String diseaseType;
	private String doctorName;
	private int exp;
	
	
	public AppointmentEntity(String userName, String userEmail,String diseaseType, String doctorName, int exp) {
		super();
				

		this.userName = userName;
	    this.userEmail = userEmail ;
		this.diseaseType = diseaseType;
		this.doctorName = doctorName;
		this.exp = exp;
				
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getDiseaseType() {
		return diseaseType;
	}


	public void setDiseaseType(String diseaseType) {
		this.diseaseType = diseaseType;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}
	
		
	
}


