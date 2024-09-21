package com.typecasting;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String>();

		list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        
        list.addFirst("Zero");
        list.addLast("Six");
        String a = list.getFirst();
        String b = list.getLast();
        System.out.println(a);
        System.out.println(b);
        System.out.println(list);
        
        Iterator it = list.iterator();
        
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
	}

}
