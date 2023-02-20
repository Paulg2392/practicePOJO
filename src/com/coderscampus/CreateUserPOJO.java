package com.coderscampus;

public class CreateUserPOJO {
	
	public static void main(String[] args) {
	}
	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private int unsuccesfulLoginAttempts;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getUnsuccesfulLoginAttempts() {
		return unsuccesfulLoginAttempts;
	}
	public void setUnsuccesfulLoginAttempts(int unsuccesfulLoginAttempts) {
		this.unsuccesfulLoginAttempts = unsuccesfulLoginAttempts;
	}
	
	
	
}
