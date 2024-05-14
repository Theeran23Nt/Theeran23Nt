package org.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
public static void main(String[] args) {
	//launch browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91962\\eclipse-workspace\\seleniumtraining\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

String url=driver.getCurrentUrl();
System.out.println(url);

String url1=driver.getTitle();
System.out.println(url1);

WebElement username=driver.findElement(By.id("email"));
username.sendKeys("theeyu");

WebElement password=driver.findElement(By.id("pass"));
password.sendKeys("theeyu123");

WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
login.click();





}

}
