package Thread;

import java.util.concurrent.CountDownLatch;


class Task extends Thread{
	
	CountDownLatch cdl;
	String name;
	
	Task(CountDownLatch cdl,String name){
		this.cdl = cdl;
		this.name = name;
	}
	
	public void run() {
		System.out.println(name +" "+cdl.getCount());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cdl.countDown();
	}
}


class Task2 extends Thread{
	
	CountDownLatch cdl;
	String name;
	
	Task2(CountDownLatch cdl,String name){
		this.cdl = cdl;
		this.name = name;
	}
	
	public void run() {
		System.out.println(name +" "+cdl.getCount());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cdl.countDown();
	}
}



public class CountdownLatch {

	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch cdl = new CountDownLatch(2);
		Task task = new Task(cdl, "Task1");
		Task2 task1 = new Task2(cdl, "Task2");
		
		task.start();
		task1.start();
		
		cdl.await();
		
		System.out.println("Main Completed");

		System.out.println("Main Completed2");

		System.out.println("Main Completed1");
<<<<<<< HEAD
		System.out.println("Main Completed10");
=======
		System.out.println("Main Completed8");
>>>>>>> c66e4dcc47550a72c0e8ec2a0847b463ee266e69

	}

}
