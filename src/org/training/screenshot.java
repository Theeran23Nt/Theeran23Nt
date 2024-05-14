package org.training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91962\\eclipse-workspace\\seleniumtraining\\drivers\\chromedriver.exe");
		// to launch browser
	WebDriver driver=new ChromeDriver();  //Upcasting
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	TakesScreenshot tk=(TakesScreenshot)driver; //downcasting
	File scr=tk.getScreenshotAs(OutputType.FILE);
	System.out.println(scr);
	
	File des=new File("D:\\fb.jpg");
	FileUtils.copyFile(scr, des);
	
	
	

	}

}
