package stepdefination;

import businesslib.CalculatorBusinessLib;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeLoanCalculatorTest {

	CalculatorBusinessLib blib = new CalculatorBusinessLib();

	@Given("Open browser and Launch the appilcation")
	public void open_browser_and_launch_the_appilcation() {

		try {
			blib.launchBrowser("chrome");
		} catch (Exception e) {

		}

	}

	@When("Perform the the calculator functionality with Valid data")
	public void perform_the_the_calculator_functionality_with_valid_data() {
		try {
			blib.verifyCalculatorFunctionality();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("Verify the estimated the borrow value")
	public void verify_the_estimated_the_borrow_value() {

		try {
			blib.verifyEstimatedValue();
		} catch (Exception e) {
		}

	}

	@Then("Click on startover button")
	public void click_on_startover_button() {

		try {
			blib.clickOnStartOver();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@When("Perform the Calculator functionality with only living expences")
	public void perform_the_calculator_functionality_with_only_living_expences() {

		try {
			blib.verifyCalculatorWithLivingExpences();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("Verify the callback message")
	public void verify_the_callback_message() {
		try {
			blib.verifyCallBackMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
