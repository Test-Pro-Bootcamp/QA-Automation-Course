package lesson10;

import java.util.ArrayList;
import java.util.List;

public class Lesson10Practice1 {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.changeGear(1);
		bike.speedUp(30);
		bike.applyBrakes(10);

		Car car = new Car();
		car.changeGear(5);
		car.speedUp(60);
		car.applyBrakes(20);
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(bike);
		vehicles.add(car);
	}

}
