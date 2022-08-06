package Chekboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample4_Select_First2_checkboxes {
	
	
	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		List<WebElement> chekboxs = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')] "));
			
		
		int size=chekboxs.size();
		
		for(int i=0;i<size;i++)
		{
			if(i<2)
			{
				chekboxs.get(i).click();
			}
		}
		
	}

}
