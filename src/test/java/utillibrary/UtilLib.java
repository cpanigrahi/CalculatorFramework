package utillibrary;

import java.util.concurrent.TimeUnit;

public class UtilLib {

	public void implicitwait() {
		BrowserLib.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
