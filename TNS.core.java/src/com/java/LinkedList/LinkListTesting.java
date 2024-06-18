package com.java.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListTesting {
	
	
	public static void main(String args[]) {
		LinkedList<String> list= new LinkedList<String>();
		list.add("Akshad");
		list.add("Vu1f2122001");
		list.add("VPPCOE");
		list.add("Mumbai");
		System.out.println(list);
		Iterator<String> it = list.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
