package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginModel {
	// Define Variables

	@NotNull(message = "Username is a required field!")
	@Size(min = 1, max = 32, message = "Username must be between 1 and 32 characters!")
	private String username;

	@NotNull(message = "Password is a required field!")
	@Size(min = 1, max = 32, message = "Password must be between 1 and 32 characters!")
	private String password;

	// default constructor, called when doing form
	public LoginModel() {

	}

	public LoginModel(String username, String password) {
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean equals(LoginModel loginModel) {
		if (loginModel.getUsername().equals(this.username) && loginModel.getPassword().equals(this.password)) {
			return true;
		} else {
			return false;
		}
	}
}