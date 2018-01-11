package myntraPom1;


import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

public class BaseClass extends BrowserPage{

	@Test
	public void testMyntra() throws InvalidFormatException, IOException {
		
		OpenBrowser();
		
		LoginPage lp = new LoginPage();
		lp.login(driver);
		
		HomePage hp = new HomePage();
		hp.homePage(driver);
		
		OrderPage op = new OrderPage();
		op.placeOrder(driver);
		
		AddressPage ap = new AddressPage();
		ap.address1(driver);
		
		
		PaymentPage pp = new PaymentPage();
	     pp.cod(driver);
		
		

	}

}
