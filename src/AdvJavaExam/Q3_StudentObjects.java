package AdvJavaExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Q3_StudentDetails {
	String name;
	int marks;
	int regNo;
	
	Q3_StudentDetails(String name, int marks, int regNo){
		this.name = name;
		this.marks = marks;
		this.regNo = regNo;
	}
	
	public String toString(){
	    String student_details = "name: "+ this.name + ", Marks:" + this.marks + ", regNo:" + regNo; 
	    return student_details;
	}
}

class Q3_SortByMarks implements Comparator<Q3_StudentDetails>{
	@Override
	public int compare(Q3_StudentDetails o1, Q3_StudentDetails o2) {
		return (o1.marks - o2.marks);
	}
}
public class Q3_StudentObjects {
	public static void main(String[] args) {
		Q3_StudentDetails s1 = new Q3_StudentDetails("Kia", 70, 1001);
		Q3_StudentDetails s2 = new Q3_StudentDetails("Rian", 80, 1002);
		Q3_StudentDetails s3 = new Q3_StudentDetails("Kohi", 40, 1003);
		Q3_StudentDetails s4 = new Q3_StudentDetails("Diya", 60, 1004);
		Q3_StudentDetails s5 = new Q3_StudentDetails("Pratham", 50, 1005);
		
		LinkedList<Q3_StudentDetails> list = new LinkedList<Q3_StudentDetails>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		Collections.sort(list, new Q3_SortByMarks());
			
		Iterator<Q3_StudentDetails> it = list.descendingIterator();
		while(it.hasNext()) {
			for(int i=0; i < list.size(); i++) {
				System.out.println((i+1) + " rank student details are : " + it.next());
			}
		}
	}
}
