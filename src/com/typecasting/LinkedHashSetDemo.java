package com.typecasting;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> st = new LinkedHashSet<String>();
		
		st.add("English");
		st.add("Tamil");
		st.add("Maths");
		st.add("Science");
		st.add("Social Science");
		st.add(null);
		
		Iterator it = st.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		st.remove("Maths");
		System.out.println(st);
		
		Set <String> st2 = new LinkedHashSet<String>();
		st2.add("English");
		st2.add("Tamil");
		st2.add(null);
		st2.add("Biology");
		
		st.retainAll(st2);
		System.out.println(st);
				
	}

}
