package FirstPack;
class Vehicle2{
	public void steering() {
		System.out.println("steering");
	}
}
class Bike2 extends Vehicle2 {
	public void bikeRunning() {
		System.out.println("Bike running");
	}
}
class Car2 extends Vehicle2 {
	public void carRunning() {
		System.out.println("Car running");
	}
}
class SmartCar2 extends Car2{
	public void smartFeature() {
		System.out.println("Smart feature");
	}
}
class MotorCar2 extends SmartCar2{
	public void motorWorking() {
		System.out.println("Motor Working");
	}
}
public class HybridInheritance {
public static void main(String[] args) {

	// TODO Auto-generated method stub
	MotorCar2 mc=new MotorCar2();
	mc.motorWorking();
	mc.smartFeature();
	mc.carRunning();
	mc.steering();
	Bike2 b=new Bike2();
	b.bikeRunning();
	b.steering();
}
}
