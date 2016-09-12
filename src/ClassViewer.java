import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ClassViewer {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> clazz = Class.forName("java.util.ArrayList");
		System.out.println("类的标准名字是：" + clazz.getCanonicalName());
		
		Constructor[] constructors = clazz.getConstructors();
		if(constructors.length != 0) {
			for(Constructor constructor : constructors) {
				System.out.println(constructors + "\t");
			}
		}else {
			System.out.println("空");
		}
		
		Field[] fields = clazz.getFields();
		if(fields.length != 0) {
			for(Field field:fields) {
				System.out.println(fields + "\t");
			}
		} else {
			System.out.println("空");
		}
		
		Method[] methods = clazz.getMethods();
		if(methods.length != 0) {
			for(Method method : methods) {
				System.out.println(method + "\t");
			}
		} else {
			System.out.println("空");
		}
		
	}
}
