package P033;

public class MyThread extends Thread{
	public void run()
	{
		try
		{
			this.stop();
		}
		catch(ThreadDeath e)
		{
			System.out.println("enter catch method");
		}
	}

}
