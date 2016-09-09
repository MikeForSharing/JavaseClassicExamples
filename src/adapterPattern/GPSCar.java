package adapterPattern;

import java.awt.Point;



public class GPSCar extends Car implements GPS{
	
	@Override
	public Point getLocation() {
		Point p = new Point();
		p.setLocation(super.getSpeed(), super.getSpeed());
		return p;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("汽车名称是：" + super.getName());
		sb.append("汽车速度是：" + super.getSpeed());
		sb.append("汽车位置是：" + getLocation().x + " "+  getLocation().y);
		return sb.toString();
	}
	
}
