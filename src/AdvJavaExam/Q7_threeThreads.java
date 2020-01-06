package AdvJavaExam;

class Thread1 extends Thread{
	public void run() {
		System.out.println("Entered in Thread1 block");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed Thread1 block");
	}
}

class Thread2 extends Thread{
	public void run() {
		System.out.println("Entered in Thread2 block");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed Thread2 block");
	}
}

class Thread3 extends Thread{
	public void run() {
		System.out.println("Entered in Thread3 block");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed Thread3 block");
	}
}

public class Q7_threeThreads{
	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		t1.start();
		t1.join();
		System.out.println("***************************************");
		t2.start();
		t2.join();
		System.out.println("***************************************");
		t3.start();
		t3.join();
	}
}

