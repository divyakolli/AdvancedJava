package AdvJavaExam;

public class Q9_deadLock_Terminated {
	static String resource1 = "lock1";
	static String resource2 = "lock2";
	static String resource3 = "lock3";

	public static class Thread1 extends Thread{
		public void run() {
			synchronized(resource1) {
				System.out.println("Thread1 called Resource1 : lock1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {}

				synchronized(resource2) {
					System.out.println("Thread1 called Resource2 : lock2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {}

					synchronized(resource3) {
						System.out.println("Thread1 called Resource3 : lock3");
					}
				}
			}
		}
	}

	public static class Thread2 extends Thread{
		public void run() {
			synchronized(resource1) {
				System.out.println("Thread2 called Resource1 : lock1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {}

				synchronized(resource2) {
					System.out.println("Thread2 called Resource2 : lock2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {}

					synchronized(resource3) {
						System.out.println("Thread2 called Resource3 : lock3");
					}
				}
			}
		}
	}

	public static class Thread3 extends Thread{
		public void run() {
			synchronized(resource1) {
				System.out.println("Thread3 called Resource1 : lock1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {}

				synchronized(resource2) {
					System.out.println("Thread3 called Resource2 : lock2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {}

					synchronized(resource3) {
						System.out.println("Thread3 called Resource3 : lock3");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();

		t1.start();
		t2.start();
		t3.start();
	}
}