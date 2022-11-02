package com.sgtesting.threaddemo;
class MyThread implements Runnable
{
	public void run()
	{
		displayEvenNumber();
	}
	void displayEvenNumber()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					System.out.println("EvenNumber: "+i);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class Threaddemo1 {

	public static void main(String[] args) {
		MyThread job=new MyThread();
		Thread t1=new Thread(job);
		t1.start();


	}

}
