package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>();
		for(Product p :getProducts()) {
			if(p.getPrice()>3000) {
				list.add(p);
			}
		}
		
		System.out.println(list);
		
		
		List<Product> list2 = getProducts().stream()
										.filter((product) -> product.getPrice() > 3000f)
										.collect(Collectors.toList());
		System.out.println(list2);
	}
	
	private static List<Product> getProducts(){
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1,"Hp laptop",1000));
		productList.add(new Product(2,"Lenovo laptop",2000));
		productList.add(new Product(3,"MacBook laptop",3000));
		productList.add(new Product(4,"Huawei laptop",4000));
		productList.add(new Product(5,"Sony laptop",5000));
		return productList;
	}

}

class Product{
	private int id;
	private String name;
	private float price;
	
	
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
