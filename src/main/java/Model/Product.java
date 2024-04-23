package Model;

import java.sql.Timestamp;

public class Product {

	private int id,categoryId, brandId,supplierId;
	private String title;
	private int price,discount;
	private String img,description;
	private boolean deleted, gender;
	private int likes;
	private Timestamp createdAt,updatedAt;
	public Product() {
		super();
	}

	public Product(int id, int categoryId, int brandId, int supplierId, String title, int price, int discount,
			String img, String description, boolean deleted, boolean gender, int likes) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.brandId = brandId;
		this.supplierId = supplierId;
		this.title = title;
		this.price = price;
		this.discount = discount;
		this.img = img;
		this.description = description;
		this.deleted = deleted;
		this.gender = gender;
		this.likes = likes;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
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
		return "Product [id=" + id + ", categoryId=" + categoryId + ", brandId=" + brandId + ", supplierId="
				+ supplierId + ", title=" + title + ", price=" + price + ", discount=" + discount + ", img=" + img
				+ ", description=" + description + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", deleted=" + deleted + ", gender=" + gender + ", likes=" + likes +"]";
	}
	
	
	
}
