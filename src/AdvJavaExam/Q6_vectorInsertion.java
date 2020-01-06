package AdvJavaExam;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Q6_vectorInsertion {
	
	static Vector<String> vec;
	
	public static void main(String[] args) {	
		String s1 = new String("tekarch");
		vec = new Vector<String>();
		vec.add(s1);
		vec.clear();
		
		String[] str = s1.split("");
		System.out.println(Arrays.toString(str));
		for(int i=0; i<str.length; i++) {
			vec.add(str[i]);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of time you want to add Z : ");
		int n = input.nextInt();
		addition(3, n);
		deletion(6, n);
		
	}
	
	public static void addition(int index, int numberOfTimes) {
		for(int i=0; i<numberOfTimes; i++) {
			vec.add(index, "Z");
		}
		Enumeration e = vec.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement());
		}
		System.out.println();
	}
	
	public static void deletion(int index, int numberOfCharacters) {
		for(int i=0; i<numberOfCharacters; i++) {
			vec.remove(index);
		}
		Enumeration e1 = vec.elements();
		while(e1.hasMoreElements()) {
			System.out.print(e1.nextElement());
		}
	}
}
