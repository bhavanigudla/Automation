package Java7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertdemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 // to maximize the screen
		 driver.manage().window().maximize();
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
		 driver.findElement(By.name("submit")).click();
		  Thread.sleep(3000);
		  driver.switchTo().alert().accept();
		  Thread.sleep(3000);
		  driver.switchTo().alert().dismiss();
		  
		
	}

}
