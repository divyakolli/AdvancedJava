package List;

import java.util.ArrayList;
import java.util.List;

public class joinMethod {

	public static List<String> names = new ArrayList<String>();

	public static void main(String[] args) throws InterruptedException {
		List<SampleThread> list = new ArrayList<SampleThread>();	
		for(int i=0; i<5; i++) {
			SampleThread s = new SampleThread();
			list.add(s);
			s.start();
		}
		for(SampleThread st : list) {
			st.join();
		}
		System.out.println(names);
	}
}

class SampleThread extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		joinMethod.names.add(getName());
		yield();
	}
}
