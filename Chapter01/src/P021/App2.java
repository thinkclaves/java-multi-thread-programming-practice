package P021;

public class App2 {
	public static void main(String[] args)
	{
		MyThread2 mythread = new MyThread2();
		System.out.println("begin = "+ System.currentTimeMillis());
		// 让进城管理器隐式调用run是异步执行的
		mythread.start();
		System.out.println("end ="+ System.currentTimeMillis());
	}

}
