package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonMethods {

	static WebDriver driver;
	
	public void enterKeys(){
		driver.findElement(By.id("Test")).sendKeys("Test");
		
	}
}
