package Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 // to maximize the screen
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/droppable/");
		 WebElement  dragMe = driver.findElement(By.id("draggable"));
		 WebElement droppable = driver.findElement(By.id("droppable"));
		 Actions builder = new Actions(driver);
		//  builder.dragAndDrop(dragMe, droppable).build().perform();
         
		 builder.contextClick(droppable);
         builder.doubleClick(droppable);
		 
	}

}
