package Model;

import java.sql.Timestamp;

public class User {

	private int id;
	private String fullname,email,phoneNumber,address,password;
	private Timestamp createdAt,updatedAt;
	private boolean deleted;
	private int role;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String fullname, String email, String phoneNumber, String address, String password,
			boolean deleted, int role) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.password = password;
		this.deleted = deleted;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
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

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", password=" + password + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", deleted=" + deleted + ", role=" + role + "]";
	}
	
}
