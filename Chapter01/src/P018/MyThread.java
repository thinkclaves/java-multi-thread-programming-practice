package P018;

public class MyThread extends Thread{
	public void run()
	{
		System.out.println("run=" + this.isAlive());
	}

}
