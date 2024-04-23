package Model;

import java.sql.Timestamp;

public class Cart {
	private int id, userId;
	private Timestamp createdAt,updatedAt;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int id, int userId) {
		super();
		this.id = id;
		this.userId = userId;
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
		return "Cart [id=" + id + ", userId=" + userId + "]";
	}
	
}
