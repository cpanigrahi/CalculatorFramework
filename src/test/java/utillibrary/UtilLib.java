package utillibrary;

import java.time.Duration;

public class UtilLib {

	public void implicitwait() {
		BrowserLib.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
