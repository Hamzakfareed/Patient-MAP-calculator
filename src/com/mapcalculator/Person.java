package com.mapcalculator;

public class Person {

	private static int count = 0;
	private int id=0;
	private String firstName;
	private String lastName;
	
	private double mapValue;
	private String mapCategory;
	
	
	public Person(String firstName , String lastName , double mapValue,String mapCategory) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mapValue = mapValue;
		this.mapCategory = mapCategory;
		id=count++;;
	}
	public Person(int id , String firstName , String lastName , double mapValue,String mapCategory) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mapValue = mapValue;
		this.mapCategory = mapCategory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double  getMapValue() {
		return mapValue;
	}

	public void setMapValue(double mapValue) {
		this.mapValue = mapValue;
	}

	public String getMapCategory() {
		return mapCategory;
	}
	public void setMapCategory(String mapCategory) {
		this.mapCategory = mapCategory;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mapValue=" + mapValue
				+ ", mapCategory=" + mapCategory + "]";
	}
	
	
}
