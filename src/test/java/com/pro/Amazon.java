package com.pro;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	@Test
	public void launch_Browser() {
		System.out.println("program started");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.amazon.com");
		System.out.println("Browser Launched");
		
	}
	
	
	
	
	
	
	
	
	
}
