package Chekboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3_Select_MultipleCheckboxsBy_CHOICE {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		List<WebElement> chekboxs = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')] "));

		for (WebElement day : chekboxs) 
		{
			String id=day.getAttribute("id");
			if(id.equals("monday")|| id.equals("wednesday") || id.equals("sunday"))
			{
				day.click();
			}
		}


	}
}
