import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class myHashSet {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		s.add("Ram");
		s.add("Sam");
		s.add("Mam");
		s.add("Ram");
		System.out.println(s.contains("Ram"));
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}