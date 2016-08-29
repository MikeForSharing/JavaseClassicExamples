
public class BreakCycle {
	public static void main(String[] args) {
//		String[] array = new String[]{"犀牛", "斑马","老鼠","猴子","狮子","老虎","俄语"};
//		System.out.println("如果有猴子，就停止寻找");
//		for(String animal:array) {
//			if(animal.equals("猴子")) {
//				System.out.println("找到了" + animal);
//				break;
//			}
//		}
		
		
		int[][] parentScore =new int[][] {{76,86,98,77},{77,78,78,98},{98,97,65,66},{54,75,73,72}};
		N1:for(int[] first:parentScore) {
			for(int i:first) {
				if(i<60) {
					System.out.println(i);
					break N1;
				}
			}
		}
	}
}
