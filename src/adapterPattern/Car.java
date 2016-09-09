package adapterPattern;

public class Car {
	private String name;
	private int speed;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("汽车名字："  + name);
		sb.append("汽车速度：" + speed);
		return sb.toString();
	}
}
