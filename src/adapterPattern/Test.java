package adapterPattern;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("不带GPS的汽车");
		Car c1 = new Car() ;
		c1.setName("宝马");
		c1.setSpeed(30);
		System.out.println(c1);
		
		System.out.println("带GPS的汽车");
		GPSCar c2 = new GPSCar();
		c2.setName("奥迪");
		c2.setSpeed(60);
		System.out.println(c2);
	}
}
