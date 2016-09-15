import java.lang.reflect.Array;
import java.util.Arrays;


public class NewArray {
	
	public static Object increateArray(Object array) {
		Class<?> clazz = array.getClass();
		System.out.println("array.getClass()的类型是：" + array.getClass());
		System.out.println("clazz的类型是" + clazz.getClass().toString());
		if(clazz.isArray()) {
			Class<?> componentType = clazz.getComponentType();
			int length = Array.getLength(array);
			Object newArray = Array.newInstance(componentType, length+3);
			System.arraycopy(array, 0, newArray, 0, length);
			return newArray;
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		double[] a = new double[6];
		Arrays.fill(a, 8);
		System.out.println("扩展之前的数组是：" + Arrays.toString(a));
		double[] a2 = (double[]) NewArray.increateArray(a);
		System.out.println("扩展之后的数组是：" + Arrays.toString(a2));
	}
}
