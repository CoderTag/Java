package DataStructure;

public class RunnerLinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.append(4);
		ll.append(45);
		ll.append(32);
		ll.insertAtPosition(55, 4);
		ll.insertAtPosition(75, 1);
		ll.show();
		System.out.println("This list length is : " + ll.count());
		System.out.println("**********************");
		ll.deleteByPosition(3);
		ll.show();
		System.out.println("This list length is : " + ll.count());
	}

}
