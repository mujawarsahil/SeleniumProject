package Popups;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Sample1_Hiddindivision_pop_up {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		user.sendKeys("9923878723");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		Thread.sleep(5000);
		
		WebElement popup_Screenshot=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]"));
		
		File src=popup_Screenshot.getScreenshotAs(OutputType.FILE);
		
		
		String rs=RandomString.make(2);
		File trg=new File(".\\Screenshot\\popup_Login"+rs+".png");
		
		FileUtils.copyFile(src, trg);
		
		
		driver.manage().window().minimize();
		
	}

}
