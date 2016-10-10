import java.util.ArrayList;

public class ForArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			array.add(i);
		}
		
		for(int i=1;i<array.size(); i += 2) {
			System.out.print(array.get(i));
		}
	}

}
