package myntraPom1;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage extends ReadFromexcelforPom1 {
	
	public void login(WebDriver driver) throws InvalidFormatException, IOException{
		
		 WebElement element = driver.findElement(By.cssSelector(".desktop-iconUser"));
		 Actions action = new Actions(driver);
	     action.moveToElement(element).build().perform();
	     driver.findElement(By.xpath("//a[text()='login']")).click();
		
        //driver.findElement(By.cssSelector(".desktop-iconBag")).click();
		//driver.findElement(By.xpath("//a[text()='login']")).click();
	     
	     ReadFromexcelforPom1.readExcel();
		driver.findElement(By.name("email")).sendKeys(ReadFromexcelforPom1.uname);
		driver.findElement(By.name("password")).sendKeys(ReadFromexcelforPom1.pass);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
	}

}
