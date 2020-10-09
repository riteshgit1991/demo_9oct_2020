package Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class ThreadTask implements Runnable{
	String threadName = "";
	public ThreadTask(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println(threadName + " is started");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println(threadName+ " is completed");
	}
}

class ThreadTaskCallable implements Callable<String>{
	String threadName = "";
	public ThreadTaskCallable(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public String call() {
		
		System.out.println(threadName + " is started");
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println(threadName+ " is completed");
		return threadName + new Random().nextInt();
	}
}

public class ThreadPool1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ThreadTaskCallable task1 = new ThreadTaskCallable("Task1");
		ThreadTaskCallable task2 = new ThreadTaskCallable("Task2");
		ThreadTaskCallable task3 = new ThreadTaskCallable("Task3");
		ThreadTaskCallable task4 = new ThreadTaskCallable("Task4");
		ThreadTaskCallable task5 = new ThreadTaskCallable("Task5");
		
		List<ThreadTaskCallable> listTask = new ArrayList<ThreadTaskCallable>();
		listTask.add(task1);
		listTask.add(task2);
		listTask.add(task3);
		listTask.add(task4);
		listTask.add(task5);
		
		ExecutorService executer = Executors.newFixedThreadPool(2);
		//executer.submit(task1);
		//executer.submit(task2);
		//executer.submit(task3);
		//executer.submit(task4);
		//executer.submit(task5);
		
		List<Future<String>> listResult =  executer.invokeAll(listTask);
		
		if(listResult.get(0).isDone()) {
			Future<String> f = listResult.get(0);
			System.out.println("Done" + f.get().toString());
		}
		
		executer.shutdownNow();
		
	}

}
