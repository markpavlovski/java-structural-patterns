package com.pluralsight.adapter;

import java.util.Arrays;

public class EmployeeAdapterLdap implements Employee {

	private EmployeeLdap instance;

	public EmployeeAdapterLdap(EmployeeLdap instance){
		this.instance = instance;
	}

	@Override
	public String getId(){
		return this.instance.getCn();
	}
	@Override
	public String getFirstName(){
		return this.instance.getGivenName();
	}
	@Override
	public String getLastName(){
		return this.instance.getSurname();
	}
	@Override
	public String getEmail(){
		return this.instance.getMail();
	}

	@Override
	public String toString(){
		String[] stringArray = new String[]{
				"ID: " + instance.getCn(),
				"First Name: " + instance.getGivenName(),
				"Last Name: " + instance.getSurname(),
				"Email: " + instance.getMail()
		};
		return String.join(", ", stringArray);
	}

	
}
