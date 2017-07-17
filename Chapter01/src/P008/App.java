package P008;

public class App {
	public static void main(String args[])
	{
		Runnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("End");
	}
}
