package P021;

public class App2 {
	public static void main(String[] args)
	{
		MyThread2 mythread = new MyThread2();
		System.out.println("begin = "+ System.currentTimeMillis());
		// �ý��ǹ�������ʽ����run���첽ִ�е�
		mythread.start();
		System.out.println("end ="+ System.currentTimeMillis());
	}

}
