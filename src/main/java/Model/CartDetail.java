package Model;

import java.sql.Timestamp;

public class CartDetail {
	private int id, cartId, productDetailId, quantity; 
	private Timestamp createdAt,updatedAt;
	public CartDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartDetail(int id, int cartId, int productDetailId, int quantity) {
		super();
		this.id = id;
		this.cartId = cartId;
		this.productDetailId = productDetailId;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getProductDetailId() {
		return productDetailId;
	}
	public void setProductDetailId(int productDetailId) {
		this.productDetailId = productDetailId;
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
		return "CartDetail [id=" + id + ", cartId=" + cartId + ", productDetailId=" + productDetailId + ", quantity=" + quantity
				+ "]";
	}
	
}
