package P025;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//MyThread thread = new MyThread();
			//thread.start();
			//Thread.sleep(1000);
			//thread.interrupt();
			Thread.currentThread().interrupt();
			System.out.println("Is stop =" + Thread.interrupted());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}

	}

}
