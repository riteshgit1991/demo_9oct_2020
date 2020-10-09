package Thread;

class Table{

	public  void  printTable(int n) {
		synchronized (this) {
			for(int i=1;i<=5;i++) {
				System.out.println(i*n);
			}
		}
	}
}

class Thread1 extends Thread{
	
	Table table;
	int num;
	public Thread1(Table table,int num) {
		this.table = table;
		this.num = num;
	}
	
	public void run() {
		table.printTable(num);
	}
}


public class SysncTest {

	public static void main(String[] args) {
		Table table = new Table();
		Thread1 thread1 = new Thread1(table, 5);
		Thread1 thread2 = new Thread1(table, 3);
		thread1.start();
		thread2.start();
	}
}
