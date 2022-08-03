package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3_MoveInnerToOuterIframe {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.switchTo().frame("iframeResult");//switch to outer Frame
		
		driver.switchTo().frame(0);//switch to inner frame
		
		
		//catpture the text present inside the inner frame
		System.out.println("Text present inside the inner frame is "+driver.findElement(By.xpath("/html/body/h1")).getText());
		
		//now i want to go back to parent frame 
		
		driver.switchTo().parentFrame();
		
		System.out.println("text present inside the outter frame is "+driver.findElement(By.xpath("/html/body/p")).getText());
	}
}
