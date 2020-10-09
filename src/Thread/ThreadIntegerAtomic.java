package Thread;

class Thread10 extends Thread{
	
	ThreadIntegerAtomic signal;
	
	public Thread10(ThreadIntegerAtomic signal) {
		this.signal = signal;
	}
	
	public void run() {
		
		System.out.println("Thread1" +signal.signal);
		while(signal.signal) {
			//System.out.println(";;");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread1" +signal.signal);
		}
	}
}

class Thread11 extends Thread{
	
	ThreadIntegerAtomic signal;
	
	public Thread11(ThreadIntegerAtomic signal) {
		this.signal = signal;
	}
	
	public void run() {
		try {
			System.out.println("Thread2");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		signal.signal=false;
	}
}


public class ThreadIntegerAtomic {
	
	volatile Boolean signal = true;

	public static void main(String[] args) {
		
		ThreadIntegerAtomic obj = new ThreadIntegerAtomic();
		
		Thread10 t1 = new Thread10(obj);
		Thread11 t2 = new Thread11(obj);
	    t1.start();
	    t2.start();
	}

}
