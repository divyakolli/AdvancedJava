package AdvJavaExam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q8_drinkType_Quantity {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Fruit Juice", 14);
		map.put("Vegetable Juice", 10);
		map.put("Ice Tea", 14);
		map.put("Lemonade", 9);
		map.put("Ice Coffee", 20);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Available drinks are : 1)Fruit Juice 2)Vegetable Juice 3)Ice Tea 4)Lemonade 5)Ice Coffee");
		System.out.println("Enter the drink type from the available options : ");
		String drinkType = input.nextLine();
		
		System.out.println("Enter drink quantity : ");
		int drinkQuantity = input.nextInt();
		
		for(Map.Entry<String, Integer> options : map.entrySet()) {
			String key = options.getKey();
			if(drinkType.equals(key)) {
				int value = options.getValue();
				if((drinkQuantity > 0) && (drinkQuantity < value)) {
					available_drink_Quantity(key, value, drinkQuantity);
				}
				else {
					System.out.println("Selected " + drinkType + " is not currently available");
					System.out.println("Available quantity of " + drinkType + " is " + value);
				}
			}
		}
	}
	
	public static void available_drink_Quantity(String drinkType, int currentQuantity, int drinkQuantity) {
		System.out.println(drinkType + " is served");
		int updatedquantity = 0;
		for(int i=1; i<=drinkQuantity; i++) {
			updatedquantity = currentQuantity-i;
		}
		System.out.println("Current quantity of " + drinkType + " is " + updatedquantity);
	}
}
