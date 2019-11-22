import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionGenericHasSetTreeSet {

	public static void main(String[] args) {
		
		Set<Integer> values = new HashSet<>();
		System.out.println(values.add(5));
		System.out.println(values.add(54));
		System.out.println(values.add(87));
		System.out.println(values.add(5));
		System.out.println(values.add(93));
		System.out.println(values.add(24));
		
		for(int i : values)
		{
			System.out.println(i);
		}
		
		System.out.println("### With TreeSet values will be put in ascending order ###");
		values = new TreeSet<>();
		System.out.println(values.add(5));
		System.out.println(values.add(54));
		System.out.println(values.add(87));
		System.out.println(values.add(5));
		System.out.println(values.add(93));
		System.out.println(values.add(24));
		
		for(int i : values)
		{
			System.out.println(i);
		}
	}

}
