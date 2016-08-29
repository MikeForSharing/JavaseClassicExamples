import java.util.Scanner;

public class ParityCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数");
		long num = scan.nextLong();
		String result = (num % 2 == 0) ? "是偶数":"是奇数";
		
		System.out.println(result);
	}
}
