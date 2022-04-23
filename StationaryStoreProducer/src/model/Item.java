package model;

public class Item {
	
	private int itemId;
	private String itemName;
	private int quantity;
	private double itemPrice;
	private double finalPrice;
	
	public Item(int itemId, String itemName, int quantity, double itemPrice ) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	
		calculateFinalPrice();
		
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public int getItemQuantity() {
		
		return quantity;
	}
	public void setItemQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
		calculateFinalPrice();
	}
	
	
	public double getFinalPrice() {
		return finalPrice;
	}
	public void calculateFinalPrice() {
		this.finalPrice = itemPrice * quantity;
	}

	
}
