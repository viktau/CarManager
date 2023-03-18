package ua.com.foxmided.carmanager;

import java.util.Objects;

public class Car {
	String name;
	int yearOfProdaction;
	int price;
	int weight;
	Color color;
	
	public Car(String name, int yearOfProdaction, int price, int weight, Color color) {
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

	@Override
	public int hashCode() {
		return Objects.hash(color, name, price, weight, yearOfProdaction);
	}

	// створення методу equals для порівняння обєктів класу
		
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return color == other.color && Objects.equals(name, other.name) && price == other.price
				&& weight == other.weight && yearOfProdaction == other.yearOfProdaction;
	}
	
}
