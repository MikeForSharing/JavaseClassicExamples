package declaration;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;


public class ClassDeclaration {


	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> clazz = Class.forName("java.util.ArrayList");
		System.out.println("类的标准名称为：" + clazz.getCanonicalName());
		System.out.println("类的修饰符为：" + Modifier.toString(clazz.getModifiers()));
		
		System.out.println("输出类的泛型参数");
		TypeVariable<?>[]  tv = clazz.getTypeParameters();
		if(tv.length != 0) {
			for(TypeVariable<?> tvtmp : tv) {
				System.out.println(tvtmp + "\t");
			}
		}else {
			System.out.println("参数为空");
		}
		
		System.out.println("输出类实现的接口");
		Type[] types = clazz.getInterfaces();
		if(types.length != 0) {
			for(Type typetmp : types) {
				System.out.println(typetmp + "\t");
			}
		} else {
			System.out.println("空值");
		}
		
		System.out.println("输出直接继承的类");
		Type types2 = clazz.getGenericSuperclass();
		if(types2 != null) {
			System.out.println(types2);
		}else {
			System.out.println("空值");
		}

		System.out.println("输出所有注释信息，有些注释不能用反射获取");
		Annotation[] annotations = clazz.getAnnotations();
		if(annotations.length != 0) {
			for(Annotation a : annotations) {
				System.out.println(a);
			}
		} else {
			System.out.println("空值");
		}
		
		

	}

}
