package Thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Task1 extends Thread{
	
	CyclicBarrier cb;
	String name;
	
	Task1(CyclicBarrier cb,String name){
		this.cb = cb;
		this.name = name;
	}
	
	public void run() {
		System.out.println(name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			cb.await();
			System.out.println(name+ "---done----");
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



class Task3 extends Thread{
	
	CyclicBarrier cb;
	String name;
	
	Task3(CyclicBarrier cb,String name){
		this.cb = cb;
		this.name = name;
	}
	
	public void run() {
		System.out.println(name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			cb.await();
			System.out.println(name+ "---done----");
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}




public class CyclicBarrierExample {

	public static void main(String[] args) {
		
		CyclicBarrier cb = new CyclicBarrier(2);
		Task1 task1 = new Task1(cb,"Task1");
		Task3 task3 = new Task3(cb,"Task3");
		task1.start();
		task3.start();
		
		System.out.println("Main");
	}

}
