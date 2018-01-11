package myntraPom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BrowserPage {
	
	public void homePage(WebDriver driver){
		WebElement element = driver.findElement(By.cssSelector(".desktop-navLinks>div:nth-child(1)"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.cssSelector(".desktop-paneContent [href='/men-tshirts?src=tNav']")).click();
		driver.findElement(By.cssSelector(".results-base>li:nth-child(2)")).click();
	}

}
