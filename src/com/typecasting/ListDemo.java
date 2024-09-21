package com.typecasting;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List mylist = new ArrayList();
		
		mylist.add("Apple");
		mylist.add(100);
		mylist.add(null);
		mylist.add(200);
		mylist.add(100);
		mylist.add(null);
		
//		Iterator it= mylist.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		List mylist2 = new ArrayList();
		
		mylist2.add(100);
		mylist2.add(null);
		
		//mylist.removeAll(mylist2);
		mylist.retainAll(mylist2);
		
		System.out.println("After retainAll: "+mylist);
		
	}

}
