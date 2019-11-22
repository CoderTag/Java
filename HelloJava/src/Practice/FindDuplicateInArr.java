package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class FindDuplicateInArr {

	public static void main(String[] args) {
		String s[] = {"Amul", "Nandini","Sudol","Kutkuti","Amul","Sudol"};
		int i[] = {43,423,64,634,14,64,43,6464,785};
		
		//HashSet : Java collection stores unique value
		Set<String> s2 = new HashSet<String>();
		
		//One way : O(n)
		for(String st: s) {
			if(s2.add(st) == false) {
				System.out.println("Duplicate: " + st);
			}
		}
		
		Set<Integer> it = new HashSet<Integer>();
		
		for(int di: i) {
			if(it.add(di) == false) {
				System.out.println("Duplicate: " + di);
			}
		}
		
		//2nd way : O(2n)
				
		Map<String,Integer> mp = new HashMap<>();
		
		for(String str: s) {
			Integer count = mp.get(str);
			if(count == null) {
				mp.put(str, 1);
			}
			else {
				mp.put(str, ++count);
			}
		}
		
		Set<Entry<String,Integer>> entSet = mp.entrySet();
		for(Entry<String,Integer> entry: entSet)
		{
			if(entry.getValue()>1) System.out.println("Duplicate: " + entry.getKey());
		}
		
	}

}
