package ua.com.foxmided.carmanager;

public class Motorcycle {
	String name;
	int yearOfProdaction;
	int price;
	int weight;
	String color;
	String engineType;
    boolean isReadyToDrive;
	public Motorcycle(String name, int yearOfProdaction, int price, int weight, String color, String engineType,
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
    
}
