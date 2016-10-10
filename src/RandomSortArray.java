import java.util.Random;
import java.util.TreeSet;

public class RandomSortArray {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		Random ran = new Random();
		int count = 0;
		while(count<10) {
			boolean flag = ts.add(ran.nextInt(50));
			if(flag) {
				count ++;
			}
		}
		
		int size = ts.size();
		Integer[] result = new Integer[size];
		ts.toArray(result);
		System.out.println("复制后的随机数组为：");
		
		for(int value:result) {
			System.out.print(value + " ");
		}
	}
}
