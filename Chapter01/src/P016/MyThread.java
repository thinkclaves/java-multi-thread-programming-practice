package P016;

public class MyThread extends Thread{
	public MyThread()
	{
		
		System.out.println("constructor:"+Thread.currentThread().getName());
	}
	public void run()
	{
		System.out.println("run function:" + Thread.currentThread().getName());
	}
}
