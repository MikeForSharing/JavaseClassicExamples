package equalsMethod;

import java.awt.Color;

public class CatHashCode {
	private String name;
	private int age;
	private int weight;
	private Color color;
	
	public CatHashCode(String name, int age, int weight, Color color) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.color = color;
	}
	
	public  boolean equals(Object obj) {
		if(obj.getClass() != getClass())
			return false;
		if(this == obj)
			return true;
		if(obj == null) 
			return false;
		CatHashCode cat = (CatHashCode) obj;
		return name.equals(cat.name)&&color.equals(cat.color)&&(age == cat.age) && (weight == cat.weight); 
	}
	

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("名字" + name +"\n");
		sb.append("重量" + weight + "\n");
		sb.append("年龄" + age + "\n");
		sb.append("颜色" + color + "\n");
		return sb.toString();
		
	}
	
	public int hashCode() {
		return 7 * name.hashCode() + 11 * new Integer(age).hashCode() + 
				13 * new Integer(weight).hashCode() + 17 * color.hashCode();
	}
}
