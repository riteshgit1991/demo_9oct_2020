package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{

	@Override
	public void run() {
	
		System.out.println(Thread.currentThread().getName()+" hello ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


public class ThreadPool {

	public static void main(String[] args) {
		
		WorkerThread worker = new WorkerThread();
		ExecutorService service = Executors.newFixedThreadPool(5);
		service.execute(worker);
		
		service.shutdown();
	}

}
