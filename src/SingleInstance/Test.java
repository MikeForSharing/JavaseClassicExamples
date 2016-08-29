package SingleInstance;

public class Test {
	public static void main(String[] args) {
		Emperor e1 = Emperor.getInstance();
		e1.getName();
		Emperor e2 = Emperor.getInstance();
		e2.getName();
		Emperor e3 = Emperor.getInstance();
		e3.getName();
		
	}
}
