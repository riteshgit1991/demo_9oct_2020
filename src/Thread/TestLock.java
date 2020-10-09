package Thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PrintTable{
	
	Lock lock = new ReentrantLock();
	
	
	public  void print() throws InterruptedException {
		
		lock.tryLock(1000,TimeUnit.MILLISECONDS);
		for(int i=1; i<=5;i++) {
			Thread.sleep(100);
			System.out.println(i+ "  "+Thread.currentThread().getName());
		}
		
		lock.unlock();
	} 
}


class ThreadTest extends Thread{
	
	private PrintTable printTable;
	
	ThreadTest(PrintTable printTable){
		this.printTable = printTable;
	}
	
	public void run() {
		try {
			printTable.print();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


public class TestLock {

	public static void main(String[] args) {
		
		PrintTable obj = new PrintTable();
		ThreadTest t1 = new ThreadTest(obj);
		ThreadTest t2 = new ThreadTest(obj);
		ThreadTest t3 = new ThreadTest(obj);
		ThreadTest t4 = new ThreadTest(obj);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}
