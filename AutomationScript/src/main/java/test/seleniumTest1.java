package test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 // to maximize the screen
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 driver.findElement(By.linkText("Best Sellers")).click();
		 WebElement Mobileslink = driver.findElement(By.linkText("Mobiles"));
		 Mobileslink.click();
		 WebElement Electronic = driver.findElement(By.linkText("Electronics"));
		 Electronic.click();
		 }

}
