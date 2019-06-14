package com;

public class PhoneDTO {
	private String name;
	private String phone;
	private int age;
	private String gender;
	private String addr;
	
	
	public PhoneDTO(String name, String phone, int age, String gender, String addr) {
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
}
