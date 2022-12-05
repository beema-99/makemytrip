package com.runnerclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClass {
	public static WebDriver driver;
	public static void main(String[] args) {
		
	
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("www.facebook.com");
	driver.navigate().to("www.flipkart.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
	
}
}