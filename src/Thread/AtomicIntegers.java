package Thread;

import java.util.concurrent.atomic.AtomicInteger;

class Thread12 extends Thread{

	AtomicInteger ai;
	String name;
	
	Thread12(AtomicInteger ai,String name){
		this.ai = ai;
		this.name= name;
	}
	
	public void run() {
		ai.getAndIncrement();
		System.out.println(name +" "+ai.get());
	}
	
}


public class AtomicIntegers {

	public static void main(String[] args) {

		AtomicInteger ai = new AtomicInteger();
		Thread12 t1 = new Thread12(ai,"t1");
		Thread12 t2 = new Thread12(ai,"t2");
		t1.start();
		t2.start();
		System.out.println("conflict test8");
		System.out.println("conflict test2");
		System.out.println("conflict test10");
		System.out.println("conflict test12");
	

		
	}

}
