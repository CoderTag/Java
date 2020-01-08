import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Ram");
		list.add("Sam");
		list.add("Dam");
		list.add(1, "Mam");
		list.add("Kam");
		
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println("");
		
		ListIterator<String> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		System.out.println("");
		// It will not print anything as iterator went to the last element in the list
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		
		while(iterator.hasPrevious()) {
			System.out.print(iterator.previous() + " ");
		}

	}

}
