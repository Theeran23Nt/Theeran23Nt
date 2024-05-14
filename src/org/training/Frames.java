package org.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91962\\eclipse-workspace\\seleniumtraining\\drivers\\chromedriver.exe");
		// to launch browser
	WebDriver driver=new ChromeDriver();  //Upcasting
	driver.get("https://www.guru99.com/handling-iframes-selenium.html");
	driver.manage().window().maximize();
	
	driver.switchTo().frame("");
	
	WebElement img=driver.findElement(By.xpath("(//img[@decoding='async'])[4]"));
	img.click();
	
	
	

	}

}
