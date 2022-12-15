package TestNg;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class HomePageTest {

	@Test
	public void myMethod() {
	System.out.println("My Method");
	}
	@BeforeClass
	public void launchUrl() {
	System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass() {
	System.out.println("After Class");
	}

}
