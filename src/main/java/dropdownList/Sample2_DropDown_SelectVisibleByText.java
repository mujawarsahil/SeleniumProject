package dropdownList;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Sample2_DropDown_SelectVisibleByText {

	public static void main(String[] args) throws IOException, Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		driver.manage().window().maximize();
		
		WebElement Dorp = driver.findElement(By.name("country_id"));
		
		Select option=new Select(Dorp);
		
		option.selectByVisibleText("Australia");
		
		Thread.sleep(2000);
		
		WebElement logoScreenshot=driver.findElement(By.xpath("//*[@id=\"register\"]/div/div[1]/form"));
		
		File src=logoScreenshot.getScreenshotAs(OutputType.FILE);
		String s=RandomString.make(2);
		File trg=new File(".\\Screenshot\\dropDown"+s+".png");
		FileHandler.copy(src, trg);
	//	FileUtils.copyFile(src, trg);
		
	
	}
	
}
