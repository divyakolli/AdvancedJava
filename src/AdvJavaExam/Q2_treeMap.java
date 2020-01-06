package AdvJavaExam;

import java.util.Map;
import java.util.TreeMap;

class Q2_StudentsClass {

	String name;
	int regNo;
	
	Q2_StudentsClass(String name, int regNo){
		this.name = name;
		this.regNo = regNo;
	}
}

public class Q2_treeMap {

	public static void main(String[] args) {
		
		Q2_StudentsClass s1 = new Q2_StudentsClass("Kia", 1);
		Q2_StudentsClass s2 = new Q2_StudentsClass("Rian", 80);
		Q2_StudentsClass s3 = new Q2_StudentsClass("Kohi", 4);
		Q2_StudentsClass s4 = new Q2_StudentsClass("Diya", 6);
		Q2_StudentsClass s5 = new Q2_StudentsClass("Pratham", 5);

		TreeMap<Integer, Q2_StudentsClass> map = new TreeMap<Integer, Q2_StudentsClass>();	
		//Adding the elements to map
		map.put(1, s1);
		map.put(4, s2);
		map.put(5, s3);
		map.put(14, s4);
		map.put(10, s5);
		
		for(Map.Entry<Integer, Q2_StudentsClass> entry : map.entrySet()) {
			int key = entry.getKey();
			Q2_StudentsClass student = entry.getValue();
			System.out.println("Key " + key + " Details ---------> " + " name = " + student.name + " and " + "regNo = " + student.regNo);
		}
	}
}
