package com.java.core.basics.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo {
	
	// List
	// Set
	// Map
	// Stack
	// Queue
	
public static void main(String[] args) {
	
	int[] array = new int[8];
	
	List<String> list = new ArrayList<>();
	
	list.add("iiht");
	list.add("collection");
	list.add("demo");
	
	System.out.println(list);
	
	System.out.println(list.get(0));
	list.set(0, "cognizant");
	System.out.println(list.get(0));


	Iterator myIterator = list.iterator();
	
	ListIterator< String>  listIterator = list.listIterator();
	while(myIterator.hasNext()) {
		System.out.println(myIterator.next());
	}
 
	List<String> linkedList = new LinkedList<>();
	linkedList.add("test");
	
	
	
}
	

}
