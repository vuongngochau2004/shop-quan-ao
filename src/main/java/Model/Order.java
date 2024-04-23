package Model;

import java.sql.Date;
import java.sql.Timestamp;

public class Order {

	private int id, userId;
	private String fullname, email, phoneNumber, address, note;
	private Date orderDate;
	private int status;
	private Timestamp createdAt,updatedAt;
	
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int id, int userId, String fullname, String email, String phoneNumber, String address, String note,
			Date orderDate, int status) {
		super();
		this.id = id;
		this.userId = userId;
		this.fullname = fullname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.note = note;
		this.orderDate = orderDate;
		this.status = status;

	}
	



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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
		return "Order [id=" + id + ", userId=" + userId + ", fullname=" + fullname + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", note=" + note + ", orderDate=" + orderDate + ", status="
				+ status + "]";
	}
	
	
	
	
}
