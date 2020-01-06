package List;

public class Thread_Sample1 extends Thread{

	Thread_Sample1(){
		start();
	}

	public void run() {
		try {
			for(int i=0; i<10; i++) {
				System.out.println("Count is : " + i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("My thread is interrupted");
		}
		System.out.println("My Thread run is over");
	}
}

class ExtendingSample {
	public static void main(String[] args) {
		Thread_Sample1 obj = new Thread_Sample1();
		try {
			while(obj.isAlive()) {
				System.out.println("Main Thread will be alive till the child thread is alive");
				Thread.sleep(1500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main thread is interrupted");
		}
		System.out.println("Main thread run is over");
	}
}
