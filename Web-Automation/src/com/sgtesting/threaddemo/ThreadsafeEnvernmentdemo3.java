package com.sgtesting.threaddemo;
class MyThread5 implements Runnable
{
	public void run()
	{
		displayEvenNumber();	
	}
	synchronized void displayEvenNumber()
	{
		try
		{
			for(int i=20;i<=40;i++) {
				if(i%2==0)
				{
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+"DisplayEvenNumber :"+i);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class ThreadsafeEnvernmentdemo3 {

	public static void main(String[] args) {
		MyThread5 job=new MyThread5();
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);
		t1.setName("alpha");
		t2.setName("omega");
		t1.start();
		t2.start();
	}


}
