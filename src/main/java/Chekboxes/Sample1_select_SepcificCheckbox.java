package Chekboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1_select_SepcificCheckbox {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.findElement(By.xpath("//*[@id=\"monday\"]")).click();
	}

}
