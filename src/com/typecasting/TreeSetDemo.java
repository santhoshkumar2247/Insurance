package com.typecasting;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> st = new TreeSet<String>();
		
		
		st.add("B");
		st.add("C");
		st.add("D");
		st.add("A");
		//st.add(null);
		System.out.println(st.contains("X"));
		System.out.println(st);
		
		Set<String> st2 = new TreeSet<String>();
		
		st2.add("A");
		st2.add("B");
		st2.add("X");
		
		st.retainAll(st2);
				
		Iterator it = st.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
