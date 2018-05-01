package com.parasoft.testdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaidu {
	public static void main(String[] args) {
		System.out.println("~~断点1~~");
		String driverPath=System.getProperty("user.dir")+"/geckodriver.exe";  
		System.setProperty("webdriver.gecko.driver",driverPath);  
		System.out.println("~~断点2~~");
		//System.setProperty ( "webdriver.firefox.bin" , "D:/firefox/firefox.exe" );
		WebDriver a=new FirefoxDriver();   //WebDriver
		System.out.println("~~断点3~~");
		
        //最大化窗口  
        a.manage().window().maximize();  
        //设置隐性等待时间  
        a.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		System.out.println("~~断点4~~");
//		System.out.println(a.toString());
		System.out.println("~~临时断点~~");
		a.get("https://www.baidu.com");
		System.out.println("~~断点5~~");
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