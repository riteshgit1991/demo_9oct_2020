package Thread;


class Tables{

	public synchronized static void  printTable(int n) {
			for(int i=1;i<=5;i++) {
				System.out.println(i*n);
			}
	   }
   }

class Thread2 extends Thread{
	
	int num;
	public Thread2(int num) {
		this.num = num;
	}
	
	public void run() {
		Tables.printTable(num);
	}
}

public class StaticSysnchronize {
	
	public static void main(String[] args) {
		Thread2 t1 = new Thread2(2);
		Thread2 t2 = new Thread2(3);
		t1.start();
		t2.start();
	}

}
