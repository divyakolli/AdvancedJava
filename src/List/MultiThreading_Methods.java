package List;

public class MultiThreading_Methods extends Thread{

	public void run(int a, int b) {
		System.out.println("Started Thread : " + this.getId());
		//System.out.println("Current thread is : " + this.currentThread());
		System.out.println("The addition is : " + (a+b));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed Thread : " + this.getId());
	}
	public void run() { 
		System.out.println("Started Thread : " + this.getId());
		synchronized(this) {
			try {
				//Thread.sleep(5000);
				System.out.println("Waiter's block*****************");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			System.out.println("Waiter's block completed**************");
		}
		System.out.println("Completed Thread : " + this.getId());
		
		synchronized(this) {
			notify();
			System.out.println("Notifier's block*****************");
		}
	}
		
	public static void main(String[] args) throws InterruptedException {
		MultiThreading_Methods t = new MultiThreading_Methods();
		MultiThreading_Methods t1 = new MultiThreading_Methods();
		t.start();

		//		t.interrupt();
		//		System.out.println(t.isInterrupted());

		/* By giving this statement, you are telling other threads to wait until t thread is dead.
					main and other threads (in this case t1) will wait for thread t to be dead and continue with the execution.
					If you want to maintain any order of threads, you can control is by using join() method
		 */
		//t.join();

		t1.start();
		//t1.run(10, 20);


		//The below Sysout will get executed first when you call run() method, because main is also a thread
		//It will execute this thread first
		System.out.println("Code completed");
	}
}
