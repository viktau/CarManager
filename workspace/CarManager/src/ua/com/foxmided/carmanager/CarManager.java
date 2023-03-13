/**
 * 
 */
package ua.com.foxmided.carmanager;

/**
 * @author Admin
 *
 */
public class CarManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car prius = new Car("Toyota Prius",  2008, 1200, 15000, "Green");
		
		Car renault = new Car("Renault Laguna", 2008, 9700, 1600, "White" );
		
		Motorcycle suzuki = new Motorcycle("GSX-R1000", 2021, 16000, 600, "Black", "Diesel", true);
		Motorcycle yamaha = new Motorcycle("FZ1", 2007, 9000, 700, "Orage", "Gas", false);
		
	}

}
