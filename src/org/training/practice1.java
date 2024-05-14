package org.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91962\\eclipse-workspace\\seleniumtraining\\drivers\\chromedriver.exe");
		// to launch browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	/*
	WebElement username=driver.findElement(By.id("email"));
	username.sendKeys("theeyu");
	*/
	WebElement acc=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	acc.click();
 Thread.sleep(3000);
	WebElement acc1=driver.findElement(By.xpath("//input[@type='radio'])[2]"));
	acc1.click();
	}

}
