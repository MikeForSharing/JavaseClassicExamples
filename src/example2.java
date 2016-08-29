import java.util.Scanner;

public class example2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数");
		long num = scan.nextLong();
		System.out.println(num + "乘以2为" + (num<<1));
		System.out.println(num + "乘以16为" + (num<<4));

		
	}
}
