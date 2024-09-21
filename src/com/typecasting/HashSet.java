package com.typecasting;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
			HashMap<Integer, String> hm = new HashMap<Integer, String>();
			
			hm.put(1, "Santhosh");
			hm.put(2, "Yokesh");
			hm.put(3, "Baskar");
			hm.put(4, "Dhaya");
			hm.put(5, "Syed");
			
			Collection <String> values = hm.values();
			System.out.println(values);
			Set <Integer> keys = hm.keySet();
			System.out.println(keys);
			System.out.println("========================");
			for(int k:keys) {
				System.out.println(k +  "   "+hm.get(k));
			}
			System.out.println("========================");
			Iterator<Entry<Integer, String>> it= hm.entrySet().iterator();
			
			while(it.hasNext()) {
				Entry<Integer, String> entry = it.next();
				System.out.println(entry.getKey() + "       "+entry.getValue());
			}
			
 	}

}
