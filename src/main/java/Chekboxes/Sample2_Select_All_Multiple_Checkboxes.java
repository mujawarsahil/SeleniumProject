package Chekboxes;

import java.awt.Checkbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2_Select_All_Multiple_Checkboxes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		List<WebElement> chekboxs = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')] "));
		
//		for(WebElement day :chekboxs)
//		{
//			day.click();
//		}
	
		
		//2nd approch using normal for loop
		
		for(int i=0;i<chekboxs.size();i++)
		{
			chekboxs.get(i).click();
		}
	
	}

}
