package dropdownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample5_WithoutUsing_Method_select {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.manage().window().maximize();

		
		WebElement listbox=driver.findElement(By.name("country_id"));
		
		Select item=new Select(listbox);
		
		List<WebElement> listoption = item.getOptions();
		for(WebElement e:listoption)
		{
			if(e.getText().equals("India"))
			{
				e.click();
				break;
			}
		}
		
		
	}

}
