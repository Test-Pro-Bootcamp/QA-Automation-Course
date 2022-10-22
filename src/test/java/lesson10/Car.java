package lesson10;

public class Car extends Vehicle{
	private int gear;
	private int speed;
	
	public int getGear() {
		return super.getGear();
	}

	public void setGear(int gear) {
		this.gear = gear;
		super.setGear(this.gear);
	}

	public int getSpeed() {
		return super.getSpeed();
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		super.setSpeed(this.speed);
	}

}
