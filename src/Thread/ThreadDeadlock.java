package Thread;

public class ThreadDeadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String obj1 = "Ritesh";
		String obj2 = "Singh";
		
		Runnable r1=()->{
			synchronized(obj1) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			synchronized(obj2) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		
		Runnable r2=()->{
			synchronized(obj2) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			synchronized(obj1) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
	   Thread t2 = new Thread(r2);
	   t2.start();
	}

}
