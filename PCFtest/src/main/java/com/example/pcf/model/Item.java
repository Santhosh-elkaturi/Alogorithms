package com.example.pcf.model;

public class Item {

	private Integer itemId;
	private String itemName;
	private int price;
	
	public Item() {
		
	}
	
	public Item(Integer itemId, String itemName, int price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
	
}
