package com.demo;

public class SetterInjection {
	private String name;
	private String age;
	private String city;
	 
	public void setName(String name) {
		this.name = name;
	}
	 
	@Override
	public String toString() {
		return "SetterInjection [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	public void setAge(String age) {
		this.age = age;
	}
	 
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
