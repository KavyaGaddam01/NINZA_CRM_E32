package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {

	@Test
	public void productCreation() {
		
		Reporter.log("productCreation",true);
		
	}
	@Test(dependsOnMethods = {"productCreation","updateProduct"})
	public void deleteproduct() throws InterruptedException {
		
		System.out.println("deleteproduct");
	}
	
	@Test(dependsOnMethods = "productCreation")
	public void updateProduct() {
		
		Reporter.log("updateProduct",true);
		
	}
}
