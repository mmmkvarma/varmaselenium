package com.launcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLauncher {
	
	public static void main(String[] args)
	{
		System.out.println("hi");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	}
}
