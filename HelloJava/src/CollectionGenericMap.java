import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionGenericMap {

	public static void main(String[] args) {
		Map<String,String> values = new HashMap<>();
		values.put("myname","kas");
		values.put("age", "45");
		values.put("myfriend", "lalu");
		
		System.out.println(values);
		Set<String> keys = values.keySet();
		for (String key: keys)
		{
			System.out.println(key + " " + values.get(key));
		}
	}

}
