package businesslib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pagelibrary.CalculatorPageLib;
import utillibrary.BrowserLib;
import utillibrary.UtilLib;

public class CalculatorBusinessLib {

	CalculatorPageLib lpage = new CalculatorPageLib();

	UtilLib ulib = new UtilLib();

	String expectedText = "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.";

	String expectedValue = "$447,000";

	public void launchBrowser(String browser) {

		BrowserLib.getBrowser(browser);

		ulib.implicitwait();

	}

	public void closeBrowser() {

		BrowserLib.driver.quit();

	}

	public void verifyCalculatorFunctionality() throws InterruptedException {

		BrowserLib.driver.findElement(By.xpath(lpage.getPersonalLink())).click();
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getHomeLoanLink())).click();
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getCalculateBorrowingLink())).click();
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getSingleButton())).click();
		ulib.implicitwait();

		WebElement selBOX = BrowserLib.driver.findElement(By.xpath(lpage.getDependantsDropdown()));

		Select sel = new Select(selBOX);

		sel.selectByVisibleText("0");

		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getHomeToLiveInButton())).click();
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getAnnualIncomeTextBox())).sendKeys("80000");
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getAnnualOtherIncomeBox())).sendKeys("10000");
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getMonthlyExpensesTextBox())).sendKeys("500");
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getHomeLoanTextBox())).sendKeys("0");
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getOtherLoanTextBox())).sendKeys("100");
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getOtherMonthlyCommitsTextBox())).sendKeys("0");
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getCreditsTextBox())).sendKeys("10000");
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.id(lpage.getBorrowCalculaterButton())).click();

		Thread.sleep(5000);

	}

	public void verifyEstimatedValue() {

		String resultValue = BrowserLib.driver.findElement(By.id(lpage.getBorrowResultText())).getText();

		System.out.println(resultValue);

		Assert.assertEquals(resultValue, expectedValue, "Result is not Matching");

		ulib.implicitwait();

	}

	public void clickOnStartOver() {

		BrowserLib.driver.findElement(By.xpath(lpage.getStartOverButton())).click();
		ulib.implicitwait();

	}

	public void verifyCalculatorWithLivingExpences() {

		BrowserLib.driver.findElement(By.xpath(lpage.getMonthlyExpensesTextBox())).sendKeys("1");
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getHomeLoanTextBox())).sendKeys("0");
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getOtherLoanTextBox())).sendKeys("0");
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getOtherMonthlyCommitsTextBox())).sendKeys("0");
		ulib.implicitwait();

		BrowserLib.driver.findElement(By.xpath(lpage.getCreditsTextBox())).sendKeys("0");
		ulib.implicitwait();

		WebDriverWait wait = new WebDriverWait(BrowserLib.driver, 30);

		wait.until(ExpectedConditions
				.elementToBeClickable(BrowserLib.driver.findElement(By.id(lpage.getBorrowCalculaterButton()))));

		BrowserLib.driver.findElement(By.id(lpage.getBorrowCalculaterButton())).click();
		ulib.implicitwait();

	}

	public void verifyCallBackMessage() {

		String resultValue = BrowserLib.driver.findElement(By.xpath(lpage.getCallBackText())).getText();

		System.out.println(resultValue);

		Assert.assertEquals(resultValue, expectedText, "Expected text is not Matching");

		ulib.implicitwait();

		closeBrowser();
	}

}
