package com.sorted_collections_shopping;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {
	private final Map<String, StockItem> list;  //Name of the Map is list, LOL!

	public StockList() {
		this.list = new HashMap<>();
	}

	public int addStock(StockItem item) {
		if (item != null) { //check if you already have some of this item
			StockItem inStock = list.getOrDefault(item.getName(), item);

			//If there are already stock of this item
			if (inStock != item) {
				item.adjustStock(inStock.quantityInStock());
			}

			list.put(item.getName(), item);
			return item.quantityInStock();
		}
		return 0;
	}

	public int sellStock(String item, int quantity) {
		StockItem inStock = list.getOrDefault(item, null);

		if ((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)) {
			inStock.adjustStock(-quantity);
			return quantity;
		}
		return 0;
	}

	public StockItem get(String key) {
		return list.get(key);
	}

	public Map<String, StockItem> Items() {
//		return list;  //Not safe as the driver main function can modify the list (which is a map) externally
//		One way to safely do it is as follows
		//Map<String, StockItem> returnMap = new HashMap<String, StockItem>(list);
		//return returnMap;

//		Another way is
 		return Collections.unmodifiableMap(list);  //Safe to pass to main()
	}

	@Override
	public String toString() {
		String s = "\nStock\n";
		double totalCost = 0.0;
		for(Map.Entry<String,StockItem> item : list.entrySet()) {
			StockItem stockItem = item.getValue();

			double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

			s = s + stockItem + " There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
			s = s + itemValue + "\n";
			totalCost += itemValue;
		}
		return s + " Total Stock Value " + totalCost;
	}
}
