package org.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\91962\\\\eclipse-workspace\\\\seleniumtraining\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://snapdeal.com/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		WebElement abc=driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		abc.click();
		

	}

}
