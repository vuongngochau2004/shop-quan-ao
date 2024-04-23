package Model;

import java.sql.Timestamp;

public class Brand {
	
	private int id;
	private String name;
	private Timestamp createdAt,updatedAt;
	
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(int id, String name) {
		super();
		this.id = id;
		this.name = name;

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
		return "Brand [id=" + id + ", name=" + name + "]";
	}
	
	
}
