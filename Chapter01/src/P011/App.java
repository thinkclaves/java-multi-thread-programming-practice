package P011;

public class App {
	
	public static void main(String[] args)
	{
		try{
		//Thread.sleep(20000);	
		}
		catch(Exception e)
		{}
		MyThread mythread = new MyThread();
		Thread a = new Thread(mythread,"A");
		Thread b = new Thread(mythread,"B");
		Thread c = new Thread(mythread,"C");
		System.out.println("Thread main id="+Thread.currentThread().getId());
		System.out.println("Thread a'id="+a.getId());
		System.out.println("Thread b'id="+b.getId());
		System.out.println("Thread c'id="+c.getId());
		a.start();
		b.start();
		c.start();
		
	}
}
