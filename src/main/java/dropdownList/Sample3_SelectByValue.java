package dropdownList;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Sample3_SelectByValue {
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.manage().window().maximize();

		
		WebElement listbox=driver.findElement(By.name("country_id"));
		
		Select ele=new Select(listbox);
		
		ele.selectByValue("184");
		
		Thread.sleep(2000);
		
		WebElement capture=driver.findElement(By.className("col-md-7"));
		
		File src=capture.getScreenshotAs(OutputType.FILE);
		
		String s=RandomString.make(2);
		
		File trg=new File(".\\Screenshot\\dropdownByValue"+s+".png");
		
		FileHandler.copy(src, trg);
		
		
		
		
	}
}
