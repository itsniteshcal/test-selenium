package constructor;

public class MainClass1 {
	public static void main(String[] args) {
		Vehicle ktm = new Vehicle(2,2);
		Vehicle auto = new Vehicle(3,4);
		Vehicle car = new Vehicle(4,5);
		System.out.println("capacity of car" + car.Capacity);
		System.out.println("noofwheels" + car.noofwheels);
	}

}
