package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {
		Map<String,Integer>map=new LinkedHashMap<>();
		map.put("Harshit",21);
		map.put("Arun",22);
		map.put("Mayank", 26);
		
		for(Map.Entry<String,Integer>i:map.entrySet())
		{
			System.out.println(i.getKey()+"        "+i.getValue());
		}

	}

}
