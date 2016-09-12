package SetPrivateField;

import java.lang.reflect.Field;

public class Test {
	public  static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Programmer p1 = new Programmer();
		Class<?> clazz = p1.getClass();
		
		System.out.println("类的名字：" + clazz.getCanonicalName());
		Field name = clazz.getDeclaredField("name");
		System.out.println("设置前的name值：" + p1.getName());
		name.setAccessible(true);
		name.set(p1, "mike");
		System.out.println("设置后的name值：" + p1.getName());
		
		
		Field age = clazz.getDeclaredField("age");
		System.out.println("设置前的age值：" + p1.getAge());
		age.setAccessible(true);
		age.setInt(p1, 24);
		System.out.println("设置后的age值：" + p1.getAge());
		
		Field male = clazz.getDeclaredField("male");
		System.out.println("设置前的male值：" + p1.isMale());
		male.setAccessible(true);
		male.setBoolean(p1, true);
		System.out.println("设置后的male值：" + p1.isMale());
		
		
		
	}
}
