import java.util.Enumeration;
import java.util.Stack;

public class myStack {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("ritu");
		s.push("mitu");
		s.push("lilu");
		s.push("titu");
		s.push("mitu");
		System.out.println(s);
		System.out.println(s.peek());  // peek display element from top of the stack
		System.out.println(s.pop());
		System.out.println(s);		
		int pos = s.search("ritu"); //try with different name
		if(pos ==-1) {
			System.out.println("not found in stack");
		}else {
			System.out.println("element is at location " + pos + " from top of the stack");
		}
		
		System.out.println(s.firstElement());
		System.out.println(s);
		Enumeration<String> enu = s.elements();
		
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		System.out.println(s);
	
	}

}
