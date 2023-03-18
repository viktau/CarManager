package ua.com.foxmided.carmanager;

import java.util.Objects;

public class Motorcycle {
	String name;
	int yearOfProdaction;
	int price;
	int weight;
	Color color;
	String engineType;
    boolean isReadyToDrive;
	public Motorcycle(String name, int yearOfProdaction, int price, int weight, Color color, String engineType,
			boolean isReadyToDrive) {
		super();
		this.name = name;
		this.yearOfProdaction = yearOfProdaction;
		this.price = price;
		this.weight = weight;
		this.color = color;
		this.engineType = engineType;
		this.isReadyToDrive = isReadyToDrive;
	}
	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProdaction=" + yearOfProdaction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
				+ "]";
	}
	// створення методу equals для порівняння обєктів класу
	@Override
	public int hashCode() {
		return Objects.hash(color, isReadyToDrive);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		return color == other.color && isReadyToDrive == other.isReadyToDrive;
	}
	
	
    
}
