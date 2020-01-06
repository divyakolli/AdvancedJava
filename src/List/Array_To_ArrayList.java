package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Array_To_ArrayList {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 4;
		System.out.println("Before coverting to ArrayList : " + Arrays.toString(arr));
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for(int element : arr) {
			arr1.add(element);
		}
		System.out.println("After coverting to ArrayList : " + arr1);
		
		Collections.sort(arr1);
		System.out.println(Collections.synchronizedList(arr1));
		
		LinkedList<String> a = new LinkedList<String>();
		a.add("abc");
		a.add("abc");
		a.add("bc");
		//frequency method is used to return the number of times that object is repeated in the list
		System.out.println(Collections.frequency(a, "abc"));
		
		//Sorting HashSet by converting HashSet to TreeSet
		TreeSet<String> set = new TreeSet<String>();
		HashSet<String> arr3 = new HashSet<String>();
		arr3.add("abc");
		arr3.add("abc");
		arr3.add("bc");

		//to clear the contents of set
		set.clear();
		System.out.println("After clearing the set : " + set);
		
		//Adding elements from HashSet to TreeSet
		set.addAll(arr3);
		set.add("hgsjsgcvbn");
		set.add("addvdjshfsb");
		System.out.println("After adding HashSet elements into TreeSet : " + set);
		
		//Sorting HashSet by converting Hashset to ArrayList
		HashSet<Integer> arr4 = new HashSet<Integer>();
		arr4.add(1);
		arr4.add(5);
		arr4.add(2);
		arr4.add(3);
		arr1.addAll(arr4);
		System.out.println("After adding HashSet elements into ArrayList arr1 (before sorting) : " + arr1);
		
		Collections.sort(arr1);
		System.out.println("After sorting the elements of arr1 : " + arr1);
	}
}
