package threads;

class MyClass extends Thread{

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

public class Thread1 {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();		
		MyClass myClass2 = new MyClass();
		myClass.start();
		myClass2.start();

	}

}