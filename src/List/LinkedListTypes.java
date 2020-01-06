package List;

public class LinkedListTypes {
	
	public static MNode head = null;
	
	public static void addFront(int element) {
		MNode newNode = new MNode(element);
		System.out.println("Adding : " + element);
		if(head == null) {
			head = newNode;
		}else {
			newNode.link = head;
			head = newNode;
		}	
	}
	
	public static void deleteFront() {
		if(head==null) {
			System.out.println("The list is empty");
		}else {
			System.out.println("Element deleted is : " + head.value);
			head = head.link;
		}
	}
	
	public static void traverse() {
		System.out.println("List contents ************************************************");
		MNode tmp = head;
		while(tmp!=null) {
			System.out.println(tmp.value);
			tmp = tmp.link;
		}
		System.out.println("************************************************");
	}
	
	public static void main(String[] args) {
		addFront(10);
		addFront(20);
		addFront(30);
		addFront(40);
		addFront(50);
		
		traverse();
		
		deleteFront();
		traverse();
		deleteFront();
		traverse();
		deleteFront();
		traverse();
		deleteFront();
		traverse();
		deleteFront();
		traverse();
	}
}
