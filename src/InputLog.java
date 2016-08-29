import java.io.FileNotFoundException;
import java.io.PrintStream;

public class InputLog {
	public static void main(String[] args) {
		PrintStream out = System.out;
		
		PrintStream ps;
		try {
			ps = new PrintStream("G:\\zhangjiang\\book\\数据结构与算法\\algorithmsSedgewick\\javase小案例\\log.txt");
			System.setOut(ps);
			int age = 23;
			System.out.println("age is: " + age);
			String name = "mike";
			System.out.println("my name is: " + name);
			String info = name + " " + age;
			System.out.println("merge info is: " + info);
			System.out.println("日志记录结束");
			System.setOut(out);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
