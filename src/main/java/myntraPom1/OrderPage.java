package myntraPom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderPage extends BrowserPage {
	
	public void placeOrder(WebDriver driver){
		
		driver.findElement(By.cssSelector(".size-buttons-size-buttons>button:nth-child(3)")).click();
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();

		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-bag']")).click();
		driver.findElement(By.xpath("//button[text()='PLACE ORDER']")).click();
		System.out.println("click on place order");
		driver.findElement(By.xpath("//button[text()='CONTINUE TO PAYMENT']")).click();
		
	}
	/*public void securityLogin(){
		driver.findElement(By.name("email")).sendKeys("dimplesingh00786@gmail.com");
		driver.findElement(By.name("password")).sendKeys("myntra12345");
		driver.findElementByXPath("//button[text()='Log in']").click();
		
	}*/

}
