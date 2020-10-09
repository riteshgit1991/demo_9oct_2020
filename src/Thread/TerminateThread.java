package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Thread15 implements Runnable{
	
	
	public void run() {
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public class TerminateThread {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService es = Executors.newFixedThreadPool(1);
		
		
		
		es.execute(new Runnable() {
			
			@Override
			public void run() {
				try {
					System.out.println("`run");
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		es.awaitTermination(0, TimeUnit.MILLISECONDS);
		
		es.shutdown();

	}

}
