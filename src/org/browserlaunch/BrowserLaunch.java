package org.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gopinath GB\\eclipse-workspace\\GreensProject\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		WebElement userName=driver.findElement(By.xpath("//input[@id='login-username']"));
		userName.sendKeys("Gopiath");
		WebElement btn=driver.findElement(By.xpath("//input[@id='login-signin']"));
		btn.click();		
		
	}

}
