package org.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91962\\eclipse-workspace\\seleniumtraining\\drivers\\chromedriver.exe");
		// to launch browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.greenstechnologys.com/");
	
	driver.manage().window().maximize();
	WebElement course=driver.findElement(By.xpath("//a[text()='COURSES']"));
	
Actions abc=new Actions(driver);
abc.moveToElement(course).perform();

	}

}
