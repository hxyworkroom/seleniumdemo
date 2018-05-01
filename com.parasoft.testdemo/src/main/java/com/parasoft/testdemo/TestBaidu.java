package com.parasoft.testdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaidu {
	public static void main(String[] args) {
		System.out.println("~~�ϵ�1~~");
		String driverPath=System.getProperty("user.dir")+"/geckodriver.exe";  
		System.setProperty("webdriver.gecko.driver",driverPath);  
		System.out.println("~~�ϵ�2~~");
		//System.setProperty ( "webdriver.firefox.bin" , "D:/firefox/firefox.exe" );
		WebDriver a=new FirefoxDriver();   //WebDriver
		System.out.println("~~�ϵ�3~~");
		
        //��󻯴���  
        a.manage().window().maximize();  
        //�������Եȴ�ʱ��  
        a.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		System.out.println("~~�ϵ�4~~");
//		System.out.println(a.toString());
		System.out.println("~~��ʱ�ϵ�~~");
		a.get("https://www.baidu.com");
		System.out.println("~~�ϵ�5~~");
		a.findElement(By.id("kw")).sendKeys("Jtest");
		a.findElement(By.id("su")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.quit();
	}
}