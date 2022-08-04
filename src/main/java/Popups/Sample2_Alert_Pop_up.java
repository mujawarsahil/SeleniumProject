package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2_Alert_Pop_up {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("11");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		
		Alert alt = driver.switchTo().alert();
		
		String msg=alt.getText();
		System.out.println(msg);
		alt.accept();
		
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		
	
		
		
		
	}
	
}
