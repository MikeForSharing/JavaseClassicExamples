
public class BreakCycle2 {
	public static void main(String[] args) {
		String[] animal = new String[] {"老鹰","老虎","狮子","老鹰","乌龟","老鹰"};
		int eagleCount = 0;
		for(String a:animal) {
			if(a.equals("老鹰")) {
				System.out.println("抓到了一只老鹰！");
				eagleCount++;
				continue;
			}
			System.out.println("发现了" + a);
		}
		System.out.println("共发现了\"" + eagleCount  + "\"只老鹰");
	}
}
