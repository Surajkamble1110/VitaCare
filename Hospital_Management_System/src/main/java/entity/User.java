package entity;

public class User {
	
	private int id;
	private String name;
	private String email;
	private String password;
	
	
	
	public User(String name, String email, String password) {
		super();
		this.id = 1;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
		
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
	public String getPassword() {
		return password;
	}
	public void setPasword(String password) {
		this.password = password;
	}	

}

