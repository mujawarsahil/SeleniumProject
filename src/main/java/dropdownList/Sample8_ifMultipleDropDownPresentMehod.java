package dropdownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Sample8_ifMultipleDropDownPresentMehod {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		driver.get("file:///D:/Auto%20Testing/html/Multiple%20Dropdown.html");
		
		driver.manage().window().maximize();
		
		
		
		WebElement browser = driver.findElement(By.id("1"));
		selectOptions(browser, "Chrome");
		
		WebElement country=driver.findElement(By.id("2"));
		
		selectOptions(country, "India");
		
		
	}
	
	public static void selectOptions(WebElement ele, String value)
	{
		
		System.out.println();
		Select drop=new Select(ele);
		
		List<WebElement> list = drop.getOptions();
		
		System.out.println(list.size());
		System.out.println(drop);
		System.out.println(value);
		for(WebElement e :list)
		{
			System.out.println(e.getText());
			if(e.getText().equals(value))
			{
				System.out.println(e);
				e.click();
				break;
			}
		}
		
	}

}
