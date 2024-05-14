package org.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchCricbuzz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91962\\eclipse-workspace\\seleniumtraining\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);

	}

}
