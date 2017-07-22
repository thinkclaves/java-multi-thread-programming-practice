package P011;

public class MyThread extends Thread{
	private int count = 5;
	synchronized public void run()
	{
		System.out.println("MyThread id="+this.getId());
		super.run();
		count--;
		//System.out.println(this.currentThread().getName()+" count= "+ count);
	}

}
