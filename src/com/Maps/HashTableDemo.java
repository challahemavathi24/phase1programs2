package com.Maps;
	import java.util.Hashtable;
	import java.util.Map;

	public class HashTableDemo {

		public static void main(String[] args) {

			Hashtable<Integer, String> map=new Hashtable<Integer, String>();

			map.put(1, "hema");
			map.put(2, "naresh");
			map.put(5, "chinnu");
			map.put(8, "pihu");
			//map.put(null,null);
			//map.put(null, "sravani");
			//map.put(8, null);

			System.out.println(map);
			System.out.println("get element "+map.get(5));
			map.remove(8);
			System.out.println(map);

			//iterate using for loop
			for(Map.Entry m :map.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
			}

}
