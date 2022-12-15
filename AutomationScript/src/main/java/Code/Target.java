package Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 // to maximize the screen
		 driver.manage().window().maximize();
		 driver.get("https://www.target.com/");
		// driver.findElement(By.partialLinkText("Categories")).click();
		 driver.findElement(By.id("search")).sendKeys("playstations");
	}

}
