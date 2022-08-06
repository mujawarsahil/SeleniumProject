package dropdownList;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample7_BootStrapDropDown {

	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//div[@class='dropdown']//button[@id='menu1']"));
		button.click();
		
		
		Thread.sleep(2000);
		
		List <WebElement> optionList = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		
		System.out.println(optionList.size());
		
		for(WebElement item :optionList)
		{
			
			System.out.println(item.getText());
			if(item.getText().equals("JavaScript"))
			{
				item.click();
				System.out.println(item.getText());
				break;
			}
		}
		
		
	}
}
