package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableAsLambda {

	public static void main(String[] args) {
		
		Runnable runnable = ()->{
			System.out.println("Test-->"+Thread.currentThread().getName());
		};
		
		Thread t = new Thread(runnable);
		t.start();
		
		
		//Callable as Lambda
		ExecutorService executor = Executors.newFixedThreadPool(2);
		getLength(executor,"Ritesh");
		getLength(executor,"Singh");
		getLength(executor,"Jack");
		executor.shutdown();
		
	}
	
	
	public static void getLength(ExecutorService es, final String str) {
		Callable<String> callObj = ()->{
			return (str +" Thread "+Thread.currentThread().getId()+ "  length->"+ str.length());
		};
		
		Future<String> future = es.submit(callObj);
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
