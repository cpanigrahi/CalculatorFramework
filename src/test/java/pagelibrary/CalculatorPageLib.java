package pagelibrary;

public class CalculatorPageLib {

	private String singleButton = "//label[@for='application_type_single']";

	private String dependantsDropdown = "//select[@title='Number of dependants']";

	private String homeToLiveInButton = "//li[@class='selected']/label[@for='borrow_type_home']";

	private String annualIncomeTextBox = "//input[@aria-describedby='q2q1i1 q2q1i2']";

	private String monthlyExpensesTextBox = "//input[@id='expenses']";

	private String homeLoanTextBox = "//input[@id='homeloans']";

	private String otherLoanTextBox = "//input[@id='otherloans']";

	private String otherMonthlyCommitsTextBox = "//input[@aria-labelledby='q3q4']";

	private String creditsTextBox = "//input[@aria-describedby='q3q5i1']";

	private String borrowCalculaterButton = "btnBorrowCalculater";

	private String startOverButton = "//div[@class='result__restart']/button/span";

	private String annualOtherIncomeBox = "//input[@aria-labelledby='q2q2']";

	private String borrowResultText = "borrowResultTextAmount";

	private String callBackText = "//div[@aria-live='assertive']";

	private String personalLink = "//a[text()='Personal']";

	private String homeLoanLink = "//span[@class='sprite home-loans']";

	private String calculateBorrowingLink = "//a[text()='Calculate borrowing power']";

	public String getCalculateBorrowingLink() {
		return calculateBorrowingLink;
	}

	public String getHomeLoanLink() {
		return homeLoanLink;
	}

	public String getPersonalLink() {
		return personalLink;
	}

	public String getCallBackText() {
		return callBackText;
	}

	public String getBorrowResultText() {
		return borrowResultText;
	}

	public String getAnnualOtherIncomeBox() {
		return annualOtherIncomeBox;
	}

	public String getSingleButton() {
		return singleButton;
	}

	public String getDependantsDropdown() {
		return dependantsDropdown;
	}

	public String getHomeToLiveInButton() {
		return homeToLiveInButton;
	}

	public String getAnnualIncomeTextBox() {
		return annualIncomeTextBox;
	}

	public String getMonthlyExpensesTextBox() {
		return monthlyExpensesTextBox;
	}

	public String getHomeLoanTextBox() {
		return homeLoanTextBox;
	}

	public String getOtherLoanTextBox() {
		return otherLoanTextBox;
	}

	public String getOtherMonthlyCommitsTextBox() {
		return otherMonthlyCommitsTextBox;
	}

	public String getCreditsTextBox() {
		return creditsTextBox;
	}

	public String getBorrowCalculaterButton() {
		return borrowCalculaterButton;
	}

	public String getStartOverButton() {
		return startOverButton;
	}

}
