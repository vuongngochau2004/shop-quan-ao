package Model;

import java.sql.Timestamp;

public class Category{

	private int id;
	private String name;
	private int type;
	private Timestamp createdAt,updatedAt;

	public Category() {
		super();
	}


	public Category(int id, String name, int type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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
		return "Category [id=" + id + ", name=" + name +", type=" + ((type==1) ? " áo" : " quần") + "]";
	}
	
}
