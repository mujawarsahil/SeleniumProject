package Window;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1_Changing_focus_to_newWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://secure.indeed.com/");

		driver.findElement(By.xpath("//button[@id='login-facebook-button']")).click();

		Set<String> windo = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(windo);

		driver.switchTo().window(al.get(1));

		String text = driver.findElement(By.xpath("//a[@class='_97w4']")).getText();
		System.out.println(text);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9923878723");

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9011255199");

		driver.findElement(By.xpath("//input[@name='login']")).click();

		driver.switchTo().window(al.get(0));

		driver.findElement(By.xpath("//button[@id='login-google-button']")).click();
	}

}
