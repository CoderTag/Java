import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionGenerics {

	public static void main(String[] args) {
		Collection values = new ArrayList();
		values.add(4);
		values.add(12);
		values.add(429);
		System.out.println(values);
		
		Iterator it = values.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		/*
		 * COllection does not specify/access elements by index number. If we want to insert an element between two elements it is not possible
		 * with collection. For that can we need to use List. As list support index so we cn access list element using for loop 
		 *
		 */
		System.out.println("###########    Now List ##############3");
		List listvalues = new ArrayList();
		listvalues.add(4);
		listvalues.add(12);
		listvalues.add(1,429);
		listvalues.add("ABC");
		
		Iterator itt = listvalues.iterator();
		while(itt.hasNext())
		{
			System.out.println(itt.next());
		}
		
		for(int i=0; i<listvalues.size();i++)
		{
			System.out.println(listvalues.get(i));
		}
		//Enhance for loop. Check we are using object here. e.g integer in list is not int rather Integer. So all are objects
		for (Object o : listvalues)
		{
			System.out.println(o);
		}
		
		/*
		 * List can contain any values int/float/string. But if we want to restrict items in a list to only one type say integer then we have to use 
		 * Generic
		 */
		System.out.println("###########    Now Generic List ##############3");
		List<Integer> genelistlist  = new ArrayList<Integer>();
		genelistlist.add(40);
		genelistlist.add(120);
		genelistlist.add(1,429);
		//genelistlist.add("ABC");  // cant not assign string to this generic list
		
		for (Integer o : genelistlist)
		{
			System.out.println(o);
		}
		
		Collections.sort(genelistlist);
		System.out.println(genelistlist);
		Collections.reverse(genelistlist);
		System.out.println(genelistlist);
		Collections.shuffle(genelistlist);
		System.out.println(genelistlist);
	}

}
