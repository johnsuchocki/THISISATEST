package ThisIsATest;

public class LetsGoDriving {

	public static void main(String[] args) {
		
		Car vroomVroom = new Car(5, 2, true, false, 1);
		
		System.out.println("My car gets " + vroomVroom.milesPerGallon() + " miles per gallon");

		System.out.println("I currently have " + vroomVroom.getPassengers() + " passenger(s).");
		
	}
	
}
