import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>
{
	int rollNo,marks;
	String name;
	
	
	public Stud(int rollNo, int marks, String name) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Stud [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}


	public int compareTo(Stud s) {
		return marks>s.marks?1:-1;
		//return name.length>s.name.length?1:-1;  // sort by name length
	}
}

public class CollectionComparableInterface {

	public static void main(String[] args) {
		List<Stud> studs  = new ArrayList<Stud>();
		studs.add(new Stud(23,55,"Modon"));
		studs.add(new Stud(15,34,"Bodon"));
		studs.add(new Stud(25,89,"Codon"));		
		studs.add(new Stud(2,77,"Dodon"));
		
		for (Stud s: studs)
		{
			System.out.println(s);
		}
		
		System.out.println("## After Sort by marks ##");
		Collections.sort(studs);
		// Or 
		// Collection.sort(studs(i,j)->i.marks>j.marks?1:-1);
		for (Stud s: studs)
		{
			System.out.println(s);
		}
	}

}
