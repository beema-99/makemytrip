package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;

	public void browserlaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();

		}

		driver.manage().window().maximize();

	}

	// 2 geturl

	public static void geturl(String value) {
		driver.get(value);	
	} 

	//3 gettitle
	public static void gettitle(){
		String title = driver.getTitle();
		System.out.println(title);
	}

	//4 getcurrenturl
	public static void getCurrentUrl() {
		

		
		
		
	}
	
	
	}
	
	
	

