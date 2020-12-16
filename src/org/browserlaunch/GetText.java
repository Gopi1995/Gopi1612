package org.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gopinath GB\\eclipse-workspace\\GreensProject\\Library\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.trainingintambaram.net/");
		
		//contains xpath
		WebElement contains=driver.findElement(By.xpath("//p[contains(text(),'Training in Tambaram providing best one-on-one Onl')]"));
		String name=contains.getText();
		System.out.println(name);
		
		//
		
		WebElement adress=driver.findElement(By.xpath("//body/footer[@id='footer']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]"));
		String add=adress.getText();
		System.out.println(add);
		
		
		
		
		

	}

}
	