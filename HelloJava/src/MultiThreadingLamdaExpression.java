/*
 * Thread Synchronization
 * 
 */

class Counter{
	int count=0;
	
	public synchronized void increment() {
		count++;
	}
}

public class MultiThreadingLamdaExpression {

	public static void main(String[] args) throws Exception {
			
		Counter c = new Counter();
		Thread t1 = new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Hi " + Thread.currentThread().getPriority());
				c.increment();
				try {Thread.sleep(1000);} catch(Exception e) {}
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=0; i <5;i++) {
				System.out.println("Hello");
				c.increment();
				try {Thread.sleep(1000);} catch(Exception e) {}
			}
		});
		
		t1.setName("Hi Thread");
		t2.setName("Hello Thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		try {Thread.sleep(5);} catch(Exception e) {}
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("Count : " + c.count);
	}

}
