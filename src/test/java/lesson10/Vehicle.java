package lesson10;

public abstract class Vehicle implements VehicleInterface {
	private int gear;
	private int speed;
	
	@Override
	public void changeGear(int a) {
		gear = a;
	}

	@Override
	public void speedUp(int a) {
		speed += a;
	}

	@Override
	public void applyBrakes(int a) {
		speed -= a;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
