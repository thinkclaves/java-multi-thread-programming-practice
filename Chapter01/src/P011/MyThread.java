package P011;

public class MyThread extends Thread{
	private int count = 5;
	synchronized public void run()
	{
		super.run();
		count--;
		System.out.println(this.currentThread().getName()+" count= "+ count);
	}

}
