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
		Car prius = new Car("Toyota Prius",  2008, 1200, 15000, Color.GREEN);
		
		Car renault = new Car("Renault Laguna", 2008, 9700, 1600, Color.WHITE );
		
		Car renault2 = new Car("Renault Laguna", 2008, 9700, 1600, Color.WHITE );
		
		Motorcycle suzuki = new Motorcycle("GSX-R1000", 2021, 16000, 600, Color.BLACK, "Diesel", true);
		Motorcycle yamaha = new Motorcycle("FZ1", 2007, 9000, 700, Color.ORANGE, "Gas", false);
	
		System.out.println(prius);
		System.out.println(renault);
		System.out.println(suzuki);
		System.out.println(yamaha);
		
		
		System.out.println(prius.equals(renault));
		System.out.println(suzuki.equals(yamaha));
		System.out.println(renault.equals(renault2));
		
		
		
		
	}

}
