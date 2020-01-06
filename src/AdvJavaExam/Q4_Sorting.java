package AdvJavaExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q4_Sorting {
	public static void sortElement_ByFrequency(int[] array) {
		LinkedHashMap<Integer, Integer> elements = new LinkedHashMap<Integer, Integer>();		
		for(int i=0; i<array.length; i++) {
			if(elements.containsKey(array[i])) {
				elements.put(array[i], elements.get(array[i])+1);
			}
			else
				elements.put(array[i], 1);
		}
		System.out.println("Input Array : " + Arrays.toString(array));
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(Map.Entry<Integer, Integer> entry : elements.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			System.out.println("Key is : " + key + " frequency is : " + value);
	
			for(int i=0; i<value; i++) {
				arr.add(key);
			}
		}
		
		Iterator<Integer> itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of an array : ");
		int length = input.nextInt();
		System.out.println("Enter the number of elements in an array : ");
		int[] array = new int[length];
		for(int i=0; i<length; i++) {
			array[i] = input.nextInt();
		}

		sortElement_ByFrequency(array);
	}
}