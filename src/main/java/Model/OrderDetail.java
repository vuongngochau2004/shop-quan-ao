package Model;

import java.sql.Timestamp;

public class OrderDetail {	
	private int id, orderId, productDetailId, price, quantity;
	private Timestamp createdAt,updatedAt;

	public OrderDetail() {
		super();
	}

	public OrderDetail(int id, int orderId, int productDetailId, int price, int quantity) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.productDetailId = productDetailId;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductDetailId() {
		return productDetailId;
	}

	public void setProductDetailId(int productDetailId) {
		this.productDetailId = productDetailId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
		return "OrderDetail [id=" + id + ", orderId=" + orderId + ", productDetailId=" + productDetailId + ", price="
				+ price + ", quantity=" + quantity + "]";
	}
	
	
}
