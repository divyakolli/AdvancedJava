package List;

/* Using Thread class */
public class ThreadSamples extends Thread{
	public void run() {
		synchronized(this) {
			System.out.println("Task started by thread : " + this.getName());
			System.out.println("Completed task is : " + this.getName());
		}
	}

	public static void main(String[] args) {
		ThreadSamples t1 = new ThreadSamples();
		t1.start();
		ThreadSamples t2 = new ThreadSamples();
		t2.start();
	}
}


/*
public class ThreadSamples implements Runnable{
	public void run() {
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		ThreadSamples obj1 = new ThreadSamples();
		Thread t1 = new Thread(obj1);
		t1.start();

		/* or this method also can be used to directly start and run thread in Runnable interface
		obj1.run();
 */
/*	}
}
 */