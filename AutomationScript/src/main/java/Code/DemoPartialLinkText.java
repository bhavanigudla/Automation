package Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 // to maximize the screen
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 //driver.findElement(By.id("nav-hamburger-menu")).click();
		//driver.findElement(By.linkText("New Releases")).click();
		//driver.findElement(By.className("hmenu-item")).click();
		// driver.findElement(By.partialLinkText("Customer")).click();
		 
		             //css selector with id (tag and id)    synatx: css=tag#id
		          
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Iphone");
		 driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone");
		 
		// WebElement search = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		 //search.sendKeys("iphone");
		             // css selector with class name (tag and classname)    syntax: css=tag.class
		 //driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute")).sendKeys("iphones");
		 //above line does not work because it has space in class name 
		 //driver.findElement(By.cssSelector("input.nav-input.nav-progressive-attribute")).sendKeys("iphones");
		 //above line  work because we used . in between class names 
		// driver.findElement(By.cssSelector("input.nav-input")).sendKeys("iphones");
		             //css selector with attribute value (tag and attibutr value)    syntax: ss=tag[attribute=value]
		//driver.findElement(By.cssSelector("input[class = 'nav-input nav-progressive-attribute']")).sendKeys("iphones");
		             // css selector with tag ,class and attribute value      syntax:css=tag.class[attribute=value]
		 //driver.findElement(By.cssSelector("input.nav-input[class = 'nav-input nav-progressive-attribute']")).sendKeys("mobiles");
		// driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]")).sendKeys("iphones");
	}

}
