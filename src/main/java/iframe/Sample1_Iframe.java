package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1_Iframe {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		// 1st frame we will click on first link and same changes happen in second frame
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		// 2nd frame I have to open WebDriver so need to click on content present inside
		// the 2nd frame

		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[14]/a/span")).click();
		// Thread.sleep(2000);

		driver.switchTo().defaultContent();

		WebElement e = driver.findElement(By.xpath("/html/body/main/div/div[2]/iframe"));
		driver.switchTo().frame(e);
		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a")).click();

	}

}
