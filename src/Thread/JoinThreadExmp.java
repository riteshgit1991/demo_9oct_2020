package Thread;

class Thread5 extends Thread{
	

	String name;
	public Thread5(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Current Thread "+Thread.currentThread().getName()+" "+i);
			
			if(this.name.equalsIgnoreCase("t2")) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}


public class JoinThreadExmp {

	public static void main(String[] args) throws InterruptedException {
		
		Thread5 t1 = new Thread5("t1");
		Thread5 t2 = new Thread5("t2");
		Thread5 t3 = new Thread5("t3");
		t1.start();
		t2.start();
		t2.join();
		t3.start();
	}

}
