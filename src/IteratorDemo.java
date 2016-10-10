import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			array.add(i);
		}
		
		for(Iterator<Integer> it = array.iterator();it.hasNext();) {
			System.out.print(it.next());
		}
	}

}
