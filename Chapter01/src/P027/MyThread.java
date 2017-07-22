package P027;

public class MyThread extends Thread{
	public void run()
	{
		super.run();
		for(int i=0;i<750000;i++)
		{
			if(this.interrupted())
			{
				System.out.println("has stopped.So will quit.");
				break;
			}
			System.out.println("i=" + (i+1));
		}
	}

}
