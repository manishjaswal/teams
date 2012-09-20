package com.mj.beans;

public class Client {

	private String name;
	private String firstName;
	private String lastName;
	private String emailId;
	private String phoneOffice;
	private String phonePersonal;
	private String phoneLocal;
	private ClientOrganization clientOrganization;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneOffice() {
		return phoneOffice;
	}

	public void setPhoneOffice(String phoneOffice) {
		this.phoneOffice = phoneOffice;
	}

	public String getPhonePersonal() {
		return phonePersonal;
	}

	public void setPhonePersonal(String phonePersonal) {
		this.phonePersonal = phonePersonal;
	}

	public String getPhoneLocal() {
		return phoneLocal;
	}

	public void setPhoneLocal(String phoneLocal) {
		this.phoneLocal = phoneLocal;
	}

	public ClientOrganization getClientOrganisation() {
		return clientOrganization;
	}

	public void setClientOrganisation(ClientOrganization clientOrganisation) {
		this.clientOrganization = clientOrganisation;
	}

}
