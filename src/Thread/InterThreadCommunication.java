package Thread;

 class Customer{
	 int amount =10000;
	
	 public synchronized void withdraw(int amount) {
		 if(this.amount<amount) {
			 System.out.println("----less balance----");
		 }
		 try {
			 wait();
		 }catch (Exception e) {
			 
		}
		 this.amount-= amount;
		 System.out.println("----Withdraw completed----");
	 }
	 
	 public synchronized void deposit(int amount) {
		 
		 System.out.println("Depositing");
		 this.amount+=amount;
		 notify();
	 }
}
 

 class Thread3 extends Thread{
	  
	int amount; 
	Customer customer;
	public Thread3(int amount,Customer customer) {
		this.amount =amount;
		this.customer = customer;
	}
	
	public void run() {
		customer.withdraw(amount);
	}
	
 }
 
 class Thread4 extends Thread{
	  
	int amount; 
	Customer customer;
	public Thread4(int amount,Customer customer) {
		this.amount =amount;
		this.customer = customer;
	}
	
	public void run() {
		customer.deposit(amount);
	}
	
 }
 

public class InterThreadCommunication {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Thread3 thread = new Thread3(15000, customer);
		thread.start();
		Thread4 thread1 = new Thread4(20000, customer);
		thread1.start();
	}
}
