package dropdownList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample9_AutoSuggestedDropdown_BingSearch {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
		
		List<WebElement> dlist = driver
				.findElements(By.xpath("//div[@class='sa_as']//ul[@class='sa_drw']//li[@class='sa_sg']//span"));

		// List<WebElement> dlist =
		// driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		
		

		System.out.println(dlist.size());

		for (WebElement list : dlist) {
			if(list.getText().contains("selenium dev"))
			{
			
				list.click();
				break;
			}
		}
		
	}

}
