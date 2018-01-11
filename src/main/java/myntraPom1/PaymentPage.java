package myntraPom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage  extends BrowserPage{
	
	
	public void cod(WebDriver driver){
		driver.findElement(By.xpath("//li[@id='tab_cod']")).click();
	
	 
	}

}
