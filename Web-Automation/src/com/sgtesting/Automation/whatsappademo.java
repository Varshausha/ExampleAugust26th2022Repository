package com.sgtesting.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class whatsappademo  
	{
	public static  WebDriver oBroswer=null;

	public static void main(String[] args) {
		launchBrowser();
		 navigate();
	}
		
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
				oBroswer=new ChromeDriver();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}
		private static void navigate()
		{
			try
			{
				oBroswer.get("https://web.whatsapp.com/");
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
