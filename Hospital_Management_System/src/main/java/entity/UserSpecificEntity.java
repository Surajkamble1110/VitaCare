package entity;

public class UserSpecificEntity {

	private String userName;
	private String diseaseType;
	private String doctorName;
	private String date;
	private String phoneNum;

	
	public UserSpecificEntity(String userName, String diseaseType, String doctorName, String date, String phoneNum) {
		
        this.userName = userName;
		this.diseaseType= diseaseType;
		this.doctorName = doctorName;
		this.date = date;
		this.phoneNum = phoneNum;
		
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
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
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
		
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

}
