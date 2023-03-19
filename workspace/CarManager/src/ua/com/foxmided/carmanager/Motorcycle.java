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
    private int distance =0;
    
	public Motorcycle(String name, int yearOfProdaction, int price, int weight, Color color, String engineType,
			boolean isReadyToDrive) {
		super();
		this.name = name;
		this.yearOfProdaction = yearOfProdaction;
		this.price = price;
		this.weight = weight;
		// this.color = color;
		color = color.replace(" ", "");
		color = color.toUpperCase();
		this.color = Color.valueOf(color);
		this.engineType = engineType;
		this.isReadyToDrive = isReadyToDrive;
		
		//this.color = Color.valueOf(color); 
	}

	public void addDistance (int additionalDistance){
		distance +=additionalDistance;
	}
	public int getDistance() {
		return distance;
	}

	//Создать метод repair в классе Motorcycle, который будет чинить сломанный мотоцикл.
	public void repair() {
	if (isReadyToDrive ==false) 
		isReadyToDrive =true;
	}
	
	//Создать метод destroyEngine, который будет ломать мотоцикл после 200 тыс. пробега

	public void destroyEngine () {
		if (distance>=200000)
		isReadyToDrive=false;	
	}
// Создать метод, который будет красить мотоцикл
	public Color setNewColor (String newColor) {
		newColor = newColor.replace(" ", "");
		newColor = newColor.toUpperCase();
		return this.color = Color.valueOf(newColor);
	}

	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProdaction=" + yearOfProdaction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", engineType=" + engineType + ", isReadyToDrive=" + isReadyToDrive
				+ ", distance=" + distance + "]";
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
