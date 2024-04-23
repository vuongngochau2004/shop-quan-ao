package Model;

import java.sql.Timestamp;

public class ProductDetail {
	private int id, productId, size, quantity;
	private int color;
	private String img;
	private Timestamp createdAt,updatedAt;
	public ProductDetail() {
		super();
	}

	public ProductDetail(int id, int productId, int size, int quantity, int color, String img) {
		super();
		this.id = id;
		this.productId = productId;
		this.size = size;
		this.quantity = quantity;
		this.color = color;
		this.img = img;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
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
		return "ProductDetail [id=" + id + ", productId=" + productId + ", size=" + size + ", quantity=" + quantity
				+ ", createdAt=" + createdAt + ", color=" + color + ", img=" + img + "]";
	}
	
	
	
}
