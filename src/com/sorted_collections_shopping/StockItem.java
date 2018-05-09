package com.sorted_collections_shopping;

public class StockItem implements Comparable<StockItem> {
	private final String name;
	private double price;
	private int quantityStock;// = 0; - init later in constructor

	//Constructor
	public StockItem(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantityStock = 0;
	}

	//Constructor with quantityStock field
	public StockItem(String name, double price, int quantityStock) {
		this.name = name;
		this.price = price;
		this.quantityStock = quantityStock;
	}

	//Getters
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int quantityInStock() {
		return quantityStock;
	}

	//Setters
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	//IntelliJ is not creating a setter for name as it is final as it can only be initialized once.

	public void adjustStock(int quantityStock) {  //Modified setter for quantityStock
		int newQuantity = this.quantityStock + quantityStock;
		if (newQuantity >= 0) {
			this.quantityStock = newQuantity;
		}
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Entering StockItem.equals");
		if (obj == this) return true;
		if (obj == null || obj.getClass() != this.getClass()) return false;
		String objName = ((StockItem) obj).getName();
		return this.name.equals(objName); //returns true if equal
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + 31;
	}

	@Override
	public int compareTo(StockItem o) {
		System.out.println("entering StockItem.compareTo");
		if (this == o) return 0;
		if (o != null) return this.name.compareTo(o.getName());

		throw new NullPointerException();
	}

	@Override
	public String toString() {
		return this.name + " : price " + this.price;
	}
}

