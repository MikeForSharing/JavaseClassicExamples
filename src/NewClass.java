import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class NewClass {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<File> construct = File.class.getDeclaredConstructor(String.class);
		File f = construct.newInstance("/home/mike/mike.txt");
		System.out.println("使用反射机制创建mike.txt");
		try {
			f.createNewFile();
			System.out.println("文件是否创建成功："+ f.exists());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
				
		
	}
}
