package P032;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(8000);
			thread.stop();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

	}

}
