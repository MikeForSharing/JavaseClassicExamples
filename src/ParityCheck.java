import java.util.Scanner;

public class ParityCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ������");
		long num = scan.nextLong();
		String result = (num % 2 == 0) ? "��ż��":"������";
		
		System.out.println(result);
	}
}
