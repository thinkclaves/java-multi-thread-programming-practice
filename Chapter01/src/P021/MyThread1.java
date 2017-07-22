package P021;

public class MyThread1 extends Thread{
	public void run()
	{
		try{
			System.out.println("run threadName=" + this.currentThread().getName()+ " begin");
			Thread.sleep(2000);
			System.out.println("run threadName=" + this.currentThread().getName()+ " end");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
