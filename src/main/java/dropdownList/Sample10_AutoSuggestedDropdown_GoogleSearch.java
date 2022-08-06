package dropdownList;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class Sample10_AutoSuggestedDropdown_GoogleSearch {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
		
//		driver.findElement(By.xpath("//a[@class='M6CB1c yZqNl']")).click();
//		
//		Set<String> windo = driver.getWindowHandles();
//		ArrayList<String> al = new ArrayList<String>(windo);
//
//		driver.switchTo().window(al.get(1));
//		
//		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("sahilmujawar.seti@gmail.com");
//		
//		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		
		System.out.println("Child frame close succefully");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenum");
	
		List<WebElement> dropList = driver.findElements(By.xpath("//ul[@class='G43f7e']//li[@class='sbct']"));
		
		for(WebElement list :dropList)
		{
			if(list.getText().contains("selenium ide"))
			{
				list.click();
				break;
			}
				
		}
			
	}

}
