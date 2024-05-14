package org.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91962\\eclipse-workspace\\seleniumtraining\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement acc = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(bank, acc).perform();
		
		
		
		
		
		

	}

}
