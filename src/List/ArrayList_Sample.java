package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.jar.Attributes.Name;

public class ArrayList_Sample {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add("KMMReddy");
		ar.add(2);
		ar.add("Sasi");
		ar.add(3);
		ar.add("Divya");
		ar.add(4);
		ar.add("Abhi");
		System.out.println(ar);
		System.out.println(ar.get(1));
		Integer integer = (Integer) ar.get(0);
		System.out.println(integer);
		
		System.out.println(ar.clone());
		
		System.out.println("****************************");
		
		List<String> ar1 = new ArrayList<String>();
		ar1.add("Hello");
		ar1.add("Hi");
//		String string = ar1.get(1);
//		System.out.println(string);	
		//If you want to print all the values from arraylist, you need to use loop
		//iterator is used to traverse the values
		Iterator it = ar1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		List<String> ar2 = new ArrayList<String>();
		ar2.add("Selenium");
		ar2.add("Java");
		
		ar1.addAll(ar2);
		
		//Sorting the array
		Collections.sort(ar1);
		System.out.println(ar1);
		
		ar1.retainAll(ar2);
		
//		Predicate<? super String> condition = name -> name.equals("Java");
//		ar1.removeIf(condition);
		
		System.out.println("****************************");
		
		Employee e1 = new Employee("Divya", 28, "QA");
		Employee e2 = new Employee("Abhi", 34, "Manager");
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		Iterator<Employee> it1 = emp.iterator();
		while(it1.hasNext()) {
			Employee e = it1.next();
			System.out.println(e.name + " " + e.age + " " + e.dept);
		}
	}
}
