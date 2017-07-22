package P019;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOperate c = new CountOperate();
		Thread t1 = new Thread(c);
		System.out.println("main begin t1 isAlive=" + t1.isAlive());
		t1.setName("A");
		t1.start();
		System.out.println("main end t1 isAlive=" + t1.isAlive());
	}

}
