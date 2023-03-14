package ua.com.foxmided.carmanager;

public class Car {
	String name;
	int yearOfProdaction;
	int price;
	int weight;
	String color;
	
	public Car(String name, int yearOfProdaction, int price, int weight, String color) {
		super();
		this.name = name;
		this.yearOfProdaction = yearOfProdaction;
		this.price = price;
		this.weight = weight;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProdaction=" + yearOfProdaction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + "]";
	}
	

}
