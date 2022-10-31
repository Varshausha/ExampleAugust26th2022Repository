package com.sgtesting.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Studentloginpage {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) 
	{
		launchBroswer();
		navigate();
		login();
		logout();
	}

	
	private static void launchBroswer()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://studentportal.universitysolutions.in/");
		}catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
	private static void login()
	{ 
		try
		{
			oBrowser.findElement(By.id("regno")).sendKeys("9740709568");
			oBrowser.findElement(By.id("passwd")).sendKeys("7337684914");
			oBrowser.findElement(By.xpath("//*[@id=\'signin\']/div[4]/div[1]/div/button")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
	}
	}
	private static void logout()
	{
		try
		{
		oBrowser.findElement(By.linkText("exit_to_app")).click();
		oBrowser.findElement(By.className("confirm" )).click();
		Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
