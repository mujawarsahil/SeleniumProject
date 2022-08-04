package Popups;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3_ChildWindow_pop_up {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://secure.indeed.com/");
	
		
		driver.findElement(By.xpath("//button[@id='login-facebook-button']")).click();
		
		Set<String> winID = driver.getWindowHandles();
		ArrayList<String > id=new ArrayList<String>(winID);
		
		//Display Window Unique ID
		
		System.out.println("parant Id"+id.get(0));//CDwindow-0AF70F44FC32C29FF997731CFC2E60AE
		System.out.println("Child Id"+id.get(1));//CDwindow-CB487B02E4B3A748A76E548358A92B0F
		
		driver.switchTo().window(id.get(1));
		System.out.println(driver.findElement(By.xpath("//a[@class='_97w4']")).getText());
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("asd");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Thread.sleep(2000);
		
		
		WebElement popupScreenshot=driver.findElement(By.xpath("//html[@id='facebook']"));
		File src=popupScreenshot.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\Screenshot\\sample3_HiddenPopup.png");
		
		org.openqa.selenium.io.FileHandler.copy(src, trg);
		
		
	}
}
