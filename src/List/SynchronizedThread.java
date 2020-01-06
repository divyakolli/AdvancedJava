package List;

class ThreadSample {

	void printTable(int n){  
		synchronized(this){//synchronized block  
			for(int i=1;i<=5;i++){  
				System.out.println(n*i);
				Thread.yield();
				try{  
					Thread.sleep(400);  
				}catch(Exception e){System.out.println(e);}  
			}  
		}  
	}
}

class MyThread1 extends Thread{
	ThreadSample t1 = new ThreadSample();
	public void run() {
		t1.printTable(5);
	}
}

class MyThread2 extends Thread{
	ThreadSample t2 = new ThreadSample();
	public void run() {
		t2.printTable(1000);
	}
}

public class SynchronizedThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();

	}
}

/*
class MyThread1 extends Thread{
	ThreadSample t;
	MyThread1(ThreadSample t){
		this.t = t;
	}
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread{
	ThreadSample t;
	MyThread2(ThreadSample t){
		this.t = t;
	}
	public void run() {
		t.printTable(1000);
	}
}

public class SynchronizedThread {
	public static void main(String[] args) throws InterruptedException {
		ThreadSample obj = new ThreadSample();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
*/
