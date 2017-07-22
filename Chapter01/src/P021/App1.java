package P021;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 mythread = new MyThread1();
		System.out.println("begin =" + System.currentTimeMillis());
		// 显示调用run为同步执行
		mythread.run();
		System.out.println("end =" + System.currentTimeMillis());

	}

}
