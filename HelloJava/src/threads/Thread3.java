package threads;

public class Thread3 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
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
		});
		
		t1.start();

	}

}
