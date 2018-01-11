package myntraPom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage extends BrowserPage {
	
	public void address1(WebDriver driver){
		
		driver.findElement(By.xpath("//div[@class='row white-row add-new-address']")).click();
		driver.findElement(By.id("pincode")).sendKeys("560045");
		driver.findElement(By.id("locality")).sendKeys("nagwara");
		//driver.findElementByName("city").sendKeys("Bangalore");
		//driver.findElementByName("state").sendKeys("karnatka");
		driver.findElement(By.id("name")).sendKeys("simple");
		driver.findElement(By.name("address")).sendKeys("sns pg near manyata tech park");
		driver.findElement(By.id("mobile")).sendKeys("8541908402");
		driver.findElement(By.xpath("//div[@class='checkbox-home-type']")).click();
		driver.findElement(By.xpath("//button[@class='green-button submit clickable']")).click();
		driver.findElement(By.xpath("//button[text()='continue']")).click();
	}

}
