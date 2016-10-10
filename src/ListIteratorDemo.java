import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			array.add(i);
		}
		ListIterator<Integer> li = array.listIterator();
		for(li = array.listIterator();li.hasNext();) {
			li.next();
		}
		for(;li.hasPrevious();) {
			System.out.print(li.previous() + " ");
		}
	}

}
