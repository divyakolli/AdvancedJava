package List;

public class Thread_SingleandMultiple implements Runnable{

	public void run() {
		System.out.println("The thread is running");
	}
	public static void main(String[] args) {
		Thread_SingleandMultiple obj = new Thread_SingleandMultiple();
		obj.run();
	}
}

/*
 * public class Thread_SingleandMultiple extends Thread{

	public void run() {
		System.out.println("The thread is running");
	}
	public static void main(String[] args) {
		Thread_SingleandMultiple obj = new Thread_SingleandMultiple();
		obj.start();
	}
}

When we call start() method it will call the run method
*/


