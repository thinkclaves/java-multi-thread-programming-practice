package P005;

public class Run {

	public static void main(String args[])
	{
		MyThread mythread = new MyThread();
		mythread.start();
		System.out.println("Program Exits");		
	}
	
}
