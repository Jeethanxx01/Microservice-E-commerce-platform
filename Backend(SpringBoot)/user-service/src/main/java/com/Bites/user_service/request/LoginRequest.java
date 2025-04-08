package com.Bites.user_service.request;

public class LoginRequest {

	private String email;
	private String password;

	// Default Constructor
	public LoginRequest() {
	}

	// Parameterized Constructor
	public LoginRequest(String email, String password) {
		this.email = email;
		this.password = password;
	}

	// Getters
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	// Setters
	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
