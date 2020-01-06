package List;

public class RunThreadTwice extends Thread{

	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		RunThreadTwice t1 = new RunThreadTwice();
		t1.start();
		t1.start();
	}
}
