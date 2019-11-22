package threads;

class MyClass2 extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread id:"+Thread.currentThread().getId() + "- running - " +i);
			try{
				Thread.sleep(1);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
}

public class Thread2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyClass2());
		Thread t2 = new Thread(new MyClass2());
		t1.start();
		t2.start();

	}

}
