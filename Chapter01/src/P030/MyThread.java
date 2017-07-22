package P030;

public class MyThread extends Thread{
	public void run()
	{
		try
		{
			super.run();
			System.out.println("run begin");
			Thread.sleep(20000000);
			System.out.println("run end");
		}
		catch(InterruptedException e)
		{
			System.out.println("be stopped and enter catch area when thread was sleeping." + this.isInterrupted());
			e.printStackTrace();
		}
	}

}
