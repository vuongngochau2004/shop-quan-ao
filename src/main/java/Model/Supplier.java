package Model;

import java.sql.Timestamp;

public class Supplier {
	
	private int id;
	private String name,email,phoneNumber,address;
	private Timestamp createdAt,updatedAt;
	public Supplier() {
		super();
	}
	public Supplier(int id, String name, String email, String phoneNum, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNum;
		this.address = address;
	}
	public Supplier(String name, String email, String phoneNum, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNum;
		this.address = address;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNum(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", address="
				+ address + "]";
	}
	
	
}
