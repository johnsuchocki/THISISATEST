package ThisIsATest;

public class Car extends Vehicle {

	int wheels = 5;
	int doors = 4;
	boolean hasDriver = false;
	boolean hybrid = false;
	int passengers = 0;

	public Car(int wheels, int doors, boolean hasDriver, boolean hybrid, int passengers) {
		super();
		this.wheels = wheels;
		this.doors = doors;
		this.hasDriver = hasDriver;
		this.hybrid = hybrid;
		this.passengers = passengers;
	}

	@Override
	public boolean canMove() {
		return true;
	}

	@Override
	public boolean exists() {
		return true;
	}

	public int milesPerGallon() {
		if (hybrid) {
			return 60;
		} else {
			return 30;
		}
	}

	public boolean hasPassangers() {
		if (passengers > 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public boolean isHasDriver() {
		return hasDriver;
	}

	public void setHasDriver(boolean hasDriver) {
		this.hasDriver = hasDriver;
	}

	public boolean isHybrid() {
		return hybrid;
	}

	public void setHybrid(boolean hybrid) {
		this.hybrid = hybrid;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

}
