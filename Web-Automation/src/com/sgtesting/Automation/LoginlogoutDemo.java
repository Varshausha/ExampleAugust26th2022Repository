package com.sgtesting.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginlogoutDemo 
{
public static  WebDriver oBroswer=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutwindow();
		 logout();
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
			oBroswer.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
         oBroswer.findElement(By.name("username")).sendKeys("admin");
         oBroswer.findElement(By.name("pwd")).sendKeys("manager");
         oBroswer.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
         
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutwindow()
	{
		try
		{
		oBroswer.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBroswer.findElement(By.className("logout")).click();
			Thread.sleep(6000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
	
