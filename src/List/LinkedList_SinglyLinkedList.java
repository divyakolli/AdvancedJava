package List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_SinglyLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Sample1");
		list.add("Sample2");
		list.add("Sample0");
		list.add("Sample5");

		Collections.sort(list);
		System.out.println("Elements of LinkedList After sorting : " + list);
		
		list.addFirst("Sample");
		list.addLast("Sample4");
		
		Collections.sort(list);
		System.out.println("Elements of LinkedList After sorting : " + list);
		
		System.out.println(list.get(0));
		System.out.println(list.set(4, "Sample3"));
		System.out.println("Elements of LinkedList After sorting : " + list);
		
		list.remove(0);
		list.add(4, "Sample4");
		System.out.println("Elements of LinkedList After sorting : " + list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println("Elements of LinkedList After removing first and last elements : " + list);
	
		//Iteration using for loop
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("*******************************************");
		//Iteration using for-each loop
		for(String elements : list) {
			System.out.println(elements);
		}
		System.out.println("*******************************************");
		//Iteration using iterator
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*******************************************");
		//Iteration using while loop
		int i=0;
		while(list.size()>i) {
			System.out.println(list.get(i));
			i++;
		}
	}
}
